import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample
{

	public static void main(String[] args)
	{

		/*
		 * The empty list (immutable).
		 */
		List<?> emptyList = Collections.EMPTY_LIST;

		System.out.println("emptyList : " + emptyList);

		/*
		 * The empty map (immutable).
		 */
		Map<?, ?> emptyMap = Collections.EMPTY_MAP;

		System.out.println("emptyMap : " + emptyMap);

		/*
		 * The empty set (immutable).
		 */
		Set<?> emptySet = Collections.EMPTY_SET;

		System.out.println("emptySet : " + emptySet);

	}
}
