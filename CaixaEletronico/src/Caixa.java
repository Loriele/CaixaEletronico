
public class Caixa {
  int saque = 784;
  int cem = 0, cinquenta = 0, dez = 0, cinco = 0, dois = 0;
  int temp;
  
  
 if(temp >= 100){
   cem = saque / 100;
   temp = saque % 100;
 }

 if(temp >= 50){
   cinquenta = saque / 50;
   temp = temp % 50;
 }
 
 if(temp >= 10){
   dez = saque / 10;
   temp = temp % 10;
 }

 if(temp >= 5){
   cinco = saque / 5;
   temp = temp % 5;
 }
 
 if(temp >= 1){
  dois = saque / 2;
 }
  
  }
}
