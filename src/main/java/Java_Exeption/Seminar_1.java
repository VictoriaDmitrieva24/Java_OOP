package Java_Exeption;

//1. 📔 Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс.
// При этом, например:
//
//        1.1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        1.2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        1.3. если вместо массива пришел null, метод вернет -3
//        1.4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//        обработает возвращенное значение и покажет читаемый результат пользователю.
//        Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

//
//public class Seminar_1 {
//    public static void main (String[] args){
//        int arr[] = {1,2,3,4};
//
//    }
//
// //   static ErrorCode getError(){
//
//
//    }
//
//    class Error{
//        boolean flag;
//        String text;
//        int code;
//        int element;
//
//        public Error(boolean flag, String text, int code, int element) {
//            this.flag = flag;
//            this.text = text;
//            this.code = code;
//            this.element = element;
//        }
//
//        public int getElement(int[] arr, int pos, boolean flag) {
//            if (pos>=0 && pos<arr.length){
//                return arr[pos];
//            } else{
//                return
//            }
//
//
//
//        }
//    }
//
//}
//
//class ERRORS{
//    public static int IndexOutOfRange = -1;
//    public static int NotElements = -2;
//    public static int NullEхеption = -2;
//
//}