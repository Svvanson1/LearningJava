
public class SelectionSort {
	public static void sort(int a[]) {
		int min;
		int minIndex;
		for(int i = 0; i < a.length; ++i) {
				min = a[i];
				minIndex = i;
				for (int j = i + 1; j < a.length; ++j) {
					if (a[j] < min) {
						min = a[j];
						minIndex = j;
					}
				}
		a[minIndex] = a[i];
		a[i] = min;
		}
		}
	}

