package Day6

int loop = 0
def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day6\\input.txt'
def fileContents = new File(baseDir).getText().split('\\t').toList()
int verdeler
int length
def array = []
def arraySeenBefore = []
def collection = []
int n
def arr

array = prepareArray(fileContents)
//println array
collection.add(array.clone())

n = calculateNumberOfLoops(array, collection)
println 'number: '+n
println 'arraySeenBefore: '+ setAndGetArraySeenBefore()
n = calculateNumberOfLoops(arraySeenBefore, collection)

def prepareArray(def file)
{
	def ding = []
	file.eachWithIndex { item, index ->
		ding << item.toInteger()
	}
	return ding
}

int calculateNumberOfLoops(array, collection)
{
	length = array.size()
	int n = 0
	boolean i = true
	println 'hier'
	arraySeenBefore = []
	while(i == true)
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
			setAndGetArraySeenBefore(array.clone())
			i = false
		}
		n++
	} // end-of-while
	return n
}
def setAndGetArraySeenBefore(arr){
	println arr
	this.arraySeenBefore = arr
	return arraySeenBefore
}
