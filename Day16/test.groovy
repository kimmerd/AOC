package Day16

//def test = 'abcde'
//def str = '123'
//println test
//
//println test.substring(0,test.size()-1)
//println 'abc'.padLeft(8,'e')
//
//println 'str[2]: ' + str[2]
//println 'test[3]: ' + test[3]
//
//println str[1].isNumber()
//
//if(str[2].class.contains("Integer")==true)
//{
//	println 'hoi'
//}
//
//
//
//println test.replace(test[(str[2])], test[(str[1])])

def progs = 'abcdefghijklmnop'
def input = ['pd/h', 'pp/n', 'pn/p','pc/j', 'pk/f']

def n
def num = 1
input.each{ line ->
//	println 'before: ' + progs
	if(line[0]=='p')
	{
		n = line.substring(1).split'/'
		def swap1 = n[0]
		def swap2 = n[1]
		//println 'progs before p:' + progs + ' p is ' + line + ' met swap1/swap2: '+ swap1 + '/' + swap2
		def progs1 = progs
		progs = progs.replaceFirst(swap2, swap1).replaceFirst(swap1, swap2)
		if(progs1.equals(progs))
		{
			progs = progs.replaceFirst(swap1, swap2).replaceFirst(swap2, swap1)
		}
		
		println num+': progs after  p:' + progs1.equals(progs) + ' met swap1/swap2:'+ swap1 + '/' + swap2 +' because ' + progs1 +' -> ' + progs
			}
	n=''
	num++
	}
print progs