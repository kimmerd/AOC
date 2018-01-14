package Day6

int loop = 0
def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day6\\input.txt'
def fileContents = new File(baseDir).getText().split('\\t').toList()
int verdeler
int length
def array = []
def collection = []

fileContents.eachWithIndex { item, index ->
	array << item.toInteger()
}

collection.add(array.clone())

length = array.size()
int n = 0
boolean i = true

while(i==true)
{
	max = array.max()
	maxIndex = array.indexOf(max)

	index=(maxIndex+1)
	array[maxIndex]=max-max

	for(int x = 0; x < max; x++) {
		if (index >= length) {
			index = index - length
		}
		array[index] = array[index] + 1
		index++
	}// new intArray has been created

	if(	collection.containsAll([array]) == false)	{
		collection.add(array.clone())
	}
	else {
		i = false
	}
	n++
} // end-of-while
println 'number: '+n