package Day8

//def input = ['b inc 5 if a > 1', 'a inc 1 if b < 5', 'c dec -10 if a >= 1', 'c inc -20 if c == 10']
def baseDir = 'C:\\Users\\crudenk\\eclipse-workspace\\AdventOfCode\\src\\Day8'
def map = [:]
def a_side = ''
def b_side = ''
def a_value = 0
def b_value = 0
int i = 0
def b_eval_string = ''
def a_eval_string = ''
int n = 1

new File(baseDir, 'input.txt').eachLine { line ->
	line = line.split(' ')

	line.eachWithIndex{item, index ->
		if(index==0 || index==1 || index==2) {
			a_side = a_side + item
		}
		if(index==4 || index==5 || index==6) {
			b_side = b_side + item
		}
	}
	line.eachWithIndex{item, index ->
		if(index==0) {
			if( map.containsKey(item)==false) {
				map << [(item):0]
				a_value = map.get(item)
			}
			else {
				a_value = map.get(item)
			}
		}
		if(index==4) {
			if( map.containsKey(item)==false) {
				map << [(item):0]
				b_value = map.get(item)
			}
			else {
				b_value = map.get(item)}
		}
	}
	b_eval_string = b_value + line[5] + line[6]
	a_eval_string = a_value + line[1] + line [2]

	a_eval_string = a_eval_string.replace('inc',' + ').replace('dec',' - ')

	if(Eval.me(b_eval_string)==true)
	{
		map.(line[0]) = Eval.me(a_eval_string)
	}
	n++
	a_side = ''
	b_side = ''
}
println map.values().max()