import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ReadCluster
{

	static String dirName = "D:/data";

	public static void main(String[] args) throws IOException
	{

		ReadCluster readCluster = new ReadCluster();

		TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOfAllFilesSensorData = readCluster
				.getMapOfAllFilesSensonData();

		// System.out.println(mapOfAllFilesSensorData);

		TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOf_15_FilesSensorData = readCluster
				.getLimitedSensorData(mapOfAllFilesSensorData, 15);

		System.out.println(mapOf_15_FilesSensorData);
		System.out.println(mapOf_15_FilesSensorData.size());

		System.out.println("---------------------------------------------");

		TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOf_7_FilesSensorData = readCluster
				.getLimitedSensorData(mapOf_15_FilesSensorData, 7);

		System.out.println(mapOf_7_FilesSensorData);
		System.out.println(mapOf_7_FilesSensorData.size());

		ArrayList<Cluster> listOfClusters = readCluster
				.getClusters(mapOf_7_FilesSensorData);

		for (Cluster cluster : listOfClusters)
		{
			int clusterId = cluster.getId();

			System.out.println("--------------------------------------------");

			System.out.println("clusterId : " + clusterId);

			UnitData unitData = cluster.getMean();

			String fileName = unitData.getFileName();

			System.out.println("fileName : " + fileName);
			Float[] floatArray = unitData.getData();

			for (Float float1 : floatArray)
			{
				System.out.println(float1);
			}

			System.out.println("--------------------------------------------");
		}

	}

	private ArrayList<Cluster> getClusters(
			TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOf_7_FilesSensorData)
	{
		Set<Entry<String, TreeMap<Integer, ArrayList<Float>>>> entrySet = mapOf_7_FilesSensorData
				.entrySet();

		int i = 1;

		ArrayList<Cluster> clusterList = new ArrayList<Cluster>();

		for (Entry<String, TreeMap<Integer, ArrayList<Float>>> entry : entrySet)
		{
			String fileName = entry.getKey();
			TreeMap<Integer, ArrayList<Float>> floatMap = entry.getValue();

			Set<Integer> keys = floatMap.keySet();

			ArrayList<Float> consolidateList = new ArrayList<Float>();

			for (Integer key : keys)
			{
				ArrayList<Float> listOfFloats = floatMap.get(key);

				for (Float float1 : listOfFloats)
				{
					consolidateList.add(float1);
				}
			}

			System.out.println(consolidateList.size());

			UnitData unitData = new UnitData();

			unitData.setFileName(fileName);
			Float[] data = new Float[consolidateList.size()];
			data = consolidateList.toArray(data);
			unitData.setData(data);

			Cluster cluster = new Cluster(i, unitData);

			++i;

			clusterList.add(cluster);

		}

		return clusterList;

	}

	private TreeMap<String, TreeMap<Integer, ArrayList<Float>>> getLimitedSensorData(
			TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOfAllFilesSensorData,
			int limit)
	{
		TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOf_15_FilesSensorData = new TreeMap<String, TreeMap<Integer, ArrayList<Float>>>();

		Set<Entry<String, TreeMap<Integer, ArrayList<Float>>>> entrySet = mapOfAllFilesSensorData
				.entrySet();

		int j = 0;

		for (Entry<String, TreeMap<Integer, ArrayList<Float>>> entry : entrySet)
		{
			++j;
			mapOf_15_FilesSensorData.put(entry.getKey(), entry.getValue());

			if (j == limit)
			{
				break;
			}
		}
		return mapOf_15_FilesSensorData;
	}

	private TreeMap<String, TreeMap<Integer, ArrayList<Float>>> getMapOfAllFilesSensonData()
			throws FileNotFoundException, IOException
	{
		ReadCluster cluster = new ReadCluster();

		File directory = new File(dirName);

		File[] fList = directory.listFiles();

		TreeMap<String, TreeMap<Integer, ArrayList<Float>>> mapOfAllFilesSensorData = new TreeMap<String, TreeMap<Integer, ArrayList<Float>>>();

		for (File file : fList)
		{
			String fileName = file.getName();

			TreeMap<Integer, ArrayList<Float>> sensorDataMap = cluster
					.getSensorData(dirName + "/" + fileName);

			mapOfAllFilesSensorData.put(fileName, sensorDataMap);

		}
		return mapOfAllFilesSensorData;
	}

	private TreeMap<Integer, ArrayList<Float>> getSensorData(String fileName)
			throws FileNotFoundException, IOException
	{
		FileReader fileReader = new FileReader(fileName);

		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String sCurrentLine;

		TreeMap<Integer, ArrayList<Float>> treeMap = new TreeMap<Integer, ArrayList<Float>>();

		int i = 0;
		while ((sCurrentLine = bufferedReader.readLine()) != null)
		{
			++i;
			if (i != 1)
			{
				ArrayList<Float> listOfFloatValues = new ArrayList<Float>();

				String[] FloatArray = sCurrentLine.split(" ");

				for (int j = 0; j < FloatArray.length; j++)
				{
					listOfFloatValues.add(new Float(FloatArray[j]));
				}

				treeMap.put(i, listOfFloatValues);
			}

		}

		fileReader.close();
		bufferedReader.close();

		return treeMap;

	}

}
