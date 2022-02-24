/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizki;

/**
 *
 * @author ASUS
 */
public class konversi {
    float celcius;

    public konversi(float celcius) {
        this.celcius = celcius;
    }
    
float farenheit(){
    return (9 * celcius)/5 + 32;
}  

float reamur(){
     return (4* celcius)/5;
 }   

float kelvin(){
     return (float) (celcius + 273.15);
 }
    
    String info(){
        if (celcius >= 100){
            return "kondisi air mendidih";
        }else if (celcius <= 0){
            return "kondisi air membeku";
        } else{
            return "kondisi air normal";
        }
    }
}
