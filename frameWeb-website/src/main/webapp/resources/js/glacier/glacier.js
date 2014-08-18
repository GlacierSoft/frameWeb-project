/**
 * 渲染字段信息
 */
function renderGridValue(value,fields){
	for(var i =0;i<fields.length;i++){
		if(value == fields[i].value){
			return fields[i].label;
		}
	}
}
/**
 * 金额格式化格式
 */
function formatNum(strNum) {
	if(strNum){
		if (strNum.length <= 3) {
			return strNum;
		}
		if (!/^(\+|-)?(\d+)(\.\d+)?$/.test(strNum)) {
			return strNum;
		}
		var a = RegExp.$1, b = RegExp.$2, c = RegExp.$3;
		var re = new RegExp();
		re.compile("(\\d)(\\d{3})(,|$)");
		while (re.test(b)) {
			b = b.replace(re, "$1,$2$3");
		}
		return a + "" + b + "" + c;
	}
	return strNum;
};