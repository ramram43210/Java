import java.util.ArrayList;

public class Cluster
{
	private int id;
	private UnitData mean;
	private ArrayList<UnitData> clusterDataList;

	public Cluster(int id, UnitData mean)
	{
		super();
		this.id = id;
		this.mean = mean;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public UnitData getMean()
	{
		return mean;
	}

	public void setMean(UnitData mean)
	{
		this.mean = mean;
	}

	public ArrayList<UnitData> getClusterDataList()
	{
		return clusterDataList;
	}

	public void setClusterDataList(ArrayList<UnitData> clusterDataList)
	{
		this.clusterDataList = clusterDataList;
	}

}
