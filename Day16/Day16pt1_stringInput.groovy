package Day16

def progs = 'abcde'
def input = ['s1', 'x3/4','pe/b']

input.each{ line ->
	if(line[0]=='s')
	{
		def	n = line.substring(1).toInteger()
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

		progs = progs.replace(swap2, swap1).replaceFirst(swap1, swap2 )
	}
	if(line[0]=='p')
	{
		n = line.substring(1).split'/'
		def swap1 = n[0]
		def swap2 = n[1]
		progs = progs.replaceFirst(swap2, swap1).replaceFirst(swap1, swap2)
	}
	n=''
}
print progs // should be baedc
