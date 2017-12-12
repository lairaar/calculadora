var op = '';
var res = 0;
var num1 = -1;
var num2 = 0;
var visor = 0;    
    
function clicarNum(num){
	visor = document.getElementById('visor').value = document.getElementById('visor').value + num;
}
  
function clicarOp(operacao){
  op = operacao;
  if (num1 != res)
  {
	num1 = parseInt(visor);
  }
	Limpa();
}
  
function CalcResultado(){
  num2 = parseInt(visor);
  
  if (document.getElementById('visor').value === ''){
  } else {
    
	if (op == "+") {
    res = num1 + num2;
  } else {
    
  if (op == "-") {
  res = num1 - num2;
  } else {
    
  if (op == "*") {
  res = num1 * num2;
  } else {
    
  res = num1 / num2;
  
  }}}}
  
  document.getElementById('visor').value = res;
  visor = document.getElementById('visor').value
  num1 = '';
  num2 = '';
}

function Limpa() {
	document.getElementById('visor').value = '';
}
