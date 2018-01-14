package Day4

int correct = 0
int incorrect = 0
def list = []
def item_num = 0

def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day4'
new File(baseDir, 'input.txt').eachLine { line ->
	line2 = line.split(' ')

	line2.eachWithIndex{ item, index ->
		def item2 = item.split('').sort().join()
		list.add(item2)
		item_num++
	}
	if(list == list.toUnique()) {
		correct++
	} else {
		incorrect++
	}

	list = []
}
println correct