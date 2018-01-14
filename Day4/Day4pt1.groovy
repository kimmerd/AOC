package Day4

int correct = 0
int incorrect = 0

def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day4'
new File(baseDir, 'input.txt').eachLine { line ->
	line = line.split(' ')

	if(line == line.toUnique())
	{
		correct++
	}
	else {
		incorrect++
	}
}
println correct
println incorrect