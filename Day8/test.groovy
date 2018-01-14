package Day8

def map = [0,1,2,3,'4','>','6']
def mapje = ['4 > 6']
def mapje2 = "4 > 6"

def a = ''

map.eachWithIndex{ item, index->
	println item.class
	a = a + item
}
println 'a: ' + a

//println Eval.me(mapje)
if(Eval.me(mapje2)==false)
{
	println 'gelukt'
}

def code = "2 + 2"
println (Eval.me(code) )


def ding = [a:0, b:1]
println ding.'a'

//
//	eval.me("index[0] index[1] index[2]")
//	println 'hoi'
//


def string = '1234'
println string.replace('2', '000')
a = 3 - -10
println a