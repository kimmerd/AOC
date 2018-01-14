package Day16

def progs = 'abcdefghijklmnop'

def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day16'
new File(baseDir, 'input.txt').eachLine { lines ->
	line = lines.split(',')
}
line.each{line ->
	if(line[0]=='s')
	{
		def n = line.substring(1).toInteger()
		for(number in 1..n)
		{
			def pop = progs.substring( progs.size()-1, progs.size() )
			progs = progs.substring(0,progs.size()-1).padLeft(progs.size(), pop)
		}
	}
	if(line[0]=='x')
	{
		n = line.substring(1).split'/'
		def swap1 = progs[n[0].toInteger()]
		def swap2 = progs[n[1].toInteger()]
		def progs1 = progs
		progs = progs.replace(swap2, swap1).replaceFirst(swap1, swap2 )
		if(progs1.equals(progs))
		{
			progs = progs.replaceFirst(swap1, swap2).replaceFirst(swap2, swap1)
		}
	}
	if(line[0]=='p')
	{
		n = line.substring(1).split'/'
		def swap1 = n[0]
		def swap2 = n[1]
		def progs1 = progs
		progs = progs.replace(swap2, swap1).replaceFirst(swap1, swap2)
		if(progs1.equals(progs))
		{
			progs = progs.replaceFirst(swap1, swap2).replaceFirst(swap2, swap1)
		}
	}
	n=''
}
print progs
