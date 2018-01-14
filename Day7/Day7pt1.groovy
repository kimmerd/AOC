package Day7


int loop = 0
def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day7\\input.txt'
def fileContents = new File(baseDir).getText().split(' ')
def array = []

//println fileContents
int i = 1
fileContents.each {line ->
	//	println 'line ' + i + ': '+ line.split(',')
	i++
	line.eachWithIndex{index, item ->
		if(line.contains('%d')) {
			//		println 'hier: ' +line}
			println item
		}
	}
}