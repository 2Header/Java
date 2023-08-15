package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(convert(5));
        System.out.println(points(38,8));
        System.out.println(footballPoints(3,4,2));
        System.out.println(divisibleByFive(5));
        System.out.println(and(true,false));
        System.out.println(howManyWalls(54,1,43));
        System.out.println(squared(5));
        System.out.println(profitableGamble(0.2f,50f,9f));
        System.out.println(frames(1,1));
        System.out.println(mod(5,2));
    }




    //Напишите функцию, которая принимает целое число минут и преобразует его в секунды.
    public static int convert (int a){
        return (a*60);
    }
    /*Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х и 3-х очков,
находите окончательные очки для команды и возвращаете это значение.
 */
    public static int points (int a, int b){
        return (a*2+3*b);
    }
    /* Создайте функцию, которая принимает количество побед, ничьих и поражений и вычисляет количество очков, набранных футбольной командой на данный момент.
выигрыш – получают 3 очка
ничья – получают 1 очко
проигрыш – получают 0 очков
*/
    public static int footballPoints (int a, int b, int c) {
        return (a*3+b*1);
    }
    /* Создайте функцию, которая возвращает true, если целое число равномерно делится на 5, и false
 в противном случае.
 */
    public static boolean divisibleByFive (int n) {
        return (n % 5 == 0);
    }
    /* В Java есть логический оператор &&. Оператор && принимает два логических значения и возвращает true,
если оба значения истинны.
Рассмотрим a && b:
a проверяется, является ли оно истинным или ложным.
Если a равно false, возвращается false.
b проверяется, является ли оно истинным или ложным.
Если b имеет значение false, возвращается значение false.
В противном случае возвращается true (поскольку и a, и b, следовательно, истинны ).
Оператор && вернет true только для true && true.
Создайте функцию с помощью оператора&&.
*/
    public static boolean and (boolean a, boolean b) {
        return (a && b);
    }
    /*У меня есть ведро с большим количеством темно-синей краски, и я хотел бы покрасить как
можно больше стен. Создайте функцию, которая возвращает количество полных стен, которые я могу покрасить,
прежде чем мне нужно будет отправиться в магазины, чтобы купить еще.
n - это количество квадратных метров, которые я могу нарисовать.
w и h-это ширина и высота одной стены в метрах.
*/
    public static int howManyWalls (int n, int w, int h) {
        return (n/(w*h));
    }
    /*Исправьте код, чтобы решить эту задачу (только синтаксические ошибки). Посмотрите
на приведенные ниже примеры, чтобы получить представление о том, что должна делать эта функция.
 */
    public static int squared (int a) {
        return a * a;
    }
    /*Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает true, если
 prob * prize > pay; в противном случае возвращает false.
 */
    public static boolean profitableGamble(float prob, float prize, float pay) {
        return (prob * prize > pay);
    }

    //Создайте метод, который возвращает количество кадров, показанных за заданное количество
    // минут для определенного FPS.
    public static int frames (int a, int b) {
        return a*b*60;
    }
    //Создайте функцию, которая будет работать как оператор модуля % без использования оператора модуля.
// Оператор модуля-это способ определения остатка операции деления.
// Вместо того чтобы возвращать результат деления, операция по модулю возвращает остаток целого числа.
    public static int mod (int a, int b) {
        return (a - (a / b)*b);
    }

}
