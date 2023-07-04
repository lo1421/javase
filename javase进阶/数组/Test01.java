/*
在 Java 中，我们可以通过静态初始化的方式创建数组，并将其作为方法的参数传递。
其语法如下：

java
methodName(new dataType[] {element1, element2, ..., elementN});


其中，methodName 是方法的名字，dataType 是数组的数据类型，element1, element2, ..., elementN 是数组中的元素。

举个例子，假设我们有一个方法，它接受一个整型数组作为参数，计算数组中所有元素的和，并返回这个和。我们可以使用静态初始化数组的方式，将数组传递给这个方法，代码如下：

java
public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4, 5};
    int sum = sum(arr);
    System.out.println("The sum of the array is: " + sum);
}

在上面的例子中，我们首先创建了一个整型数组 arr，使用静态初始化的方式，将元素 1, 2, 3, 4, 5 添加到数组中。
接着，我们调用了 sum() 方法，并将数组 arr 作为参数传递给它。
在 sum() 方法内部，我们通过遍历数组并累加每个元素的值，计算出了数组的和，并返回这个和。最后，在 main() 方法中，我们输出了数组的和。
*/
public class Test01{
	//我们可以使用静态初始化数组的方式，将数组传递给这个方法，代码如下：
	//使用静态初始化数组的方式调用这个方法吧
	public static int sum(int[] array){
		int sum = 0;
		for (int i = 0;i<array.length;i++){
			 sum+=array[i];
		}
		return sum;
	}
	//方法里面不要在定义一个方法啦，这个错误已经犯了很多次了
	public static void main(String[] args){
		//假设有一个方法，这个方法可以接收一个整型数组作为参数，计算数组中所有元素的和，并返回这个和。
		
		System.out.println(sum(new int[]{1,2,3,4}));
		
		//由于这个方法我故设置成静态的方法是为了方便之后调用该方法的时候不用创建对象
		
	
		
	}
}