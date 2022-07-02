import java.io.*;
import java.text.MessageFormat;
import java.util.*;

public class Acmp {
    public static void main(String[] args) throws IOException {

     //Lesson 0942  Больше-Меньше
//        Scanner in=new Scanner(System.in);
//        ArrayList<String> words=new ArrayList<>();
//        try {
//            BufferedReader reader=new BufferedReader(new FileReader("input.txt"));
//            String sums="";
//            while ((sums=reader.readLine())!=null){
//               words.add(sums);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        String a="";
//        String b="";
//        for (int i=0;i< words.size();i++){
//            a= words.get(0);
//            b= words.get(1);
//        }
//        int a1=Integer.parseInt(a);
//        int b1=Integer.parseInt(b);
//        String sign="";
//        if (a1>b1){
//            sign=">";
//        }else if (a1<b1){
//            sign="<";
//        }else if (a1==b1){
//            sign="=";
//        }
//        FileWriter sign1=new FileWriter("output.txt");
//        sign1.write(sign);
//        sign1.close();


        //021 Зарплата
//        ArrayList<Integer> list = new ArrayList<>(); // Записываем все зп в коллекцию
//        int difference; // Максимальная разница в зп
//        int count; // Количество зарплат
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while (st.hasMoreTokens()){
//            list.add(Integer.valueOf(st.nextToken()));
//        }
//        Collections.sort(list); // Сортируем коллекцию
//        count = list.size(); // Получаем размер коллекции
//        difference = list.get(count-1) - list.get(0); // Из максимальной зп вычитаем минимальную
//
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(difference));
//        fileOut.close();


        //Lesson 195 Эния
//        Scanner in=new Scanner(System.in);
//        int nums;
//        ArrayList<Integer> numbers=new ArrayList<>();
//        FileReader file=new FileReader("input.txt");
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//
//        while (st.hasMoreTokens()){
//            numbers.add(Integer.valueOf(st.nextToken()));
//        }
//
//        nums=numbers.get(1)*numbers.get(2)*2*numbers.get(0);
//        FileWriter file1=new FileWriter("output.txt");
//        file1.write(String.valueOf(nums));
//        file1.close();
//    }


        //Lesson 0773 Гулливер
//        ArrayList<Integer> numeric = new ArrayList<>();
//        int nums;
//        String str;
//        FileReader fin = new FileReader("input.txt"); // Получение чисел из файла
//        Scanner sc = new Scanner(fin);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while(st.hasMoreTokens()){
//            numeric.add(Integer.valueOf(st.nextToken()));
//        }
//        nums=numeric.get(0)*numeric.get(0)*numeric.get(1);
//        FileWriter countStepFinish = new FileWriter("output.txt");// Запись числа в файл
//        countStepFinish.write(String.valueOf(nums));
//        countStepFinish.close();

        //Lesson Два бандита 033
//        ArrayList<Integer> allNumeric=new ArrayList<>();
//        FileReader reader=new FileReader("input.txt");
//        int a,b;
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//
//        while (st.hasMoreTokens()){
//            allNumeric.add(Integer.valueOf(st.nextToken()));
//        }
//        int alls=0;
//        for (Integer all : allNumeric){
//            alls+=all;
//        }
//        alls--;
//        a=alls-allNumeric.get(0);
//        b=alls-allNumeric.get(1);
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(a+" "+b);
//        writer.close();


        //Lesson 0061 Баскетбол
//        FileReader reader=new FileReader("input.txt");
//        Scanner sc=new Scanner(reader);
//        ArrayList<String> nums=new ArrayList<>();
//        String str;
//        while (sc.hasNextLine()){
//            str=sc.nextLine();
//            nums.add(str);
//        }
//        ArrayList<Integer> allNums=new ArrayList<>();
//        for (String i : nums) {
//            StringTokenizer st=new StringTokenizer(i," ");
//
//            while (st.hasMoreTokens()){
//                allNums.add(Integer.valueOf(st.nextToken()));
//            }
//        }
//        int team1=0;
//        int team2=0;
//        for (int i = 0; i < allNums.size(); i++) {
//            if ((i+1)%2==1){
//                team1+=allNums.get(i);
//                System.out.println(allNums.get(i));
//            }else {
//                team2+= allNums.get(i);
//            }
//        }
//        String sign="";
//        if (team1==team2){
//            sign="DRAW";
//        }else if (team1>team2){
//            sign="1";
//        }else {
//            sign="2";
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();

        //Lesson 0755 Сбор земляники
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Integer> nums=new ArrayList<>();
//
//        while (st.hasMoreTokens()){
//            nums.add(Integer.valueOf(st.nextToken()));
//        }
//        int x=0;
//        int y=0;
//        int z=0;
//        for (int i = 0; i < nums.size(); i++) {
//            x=nums.get(0);
//            y=nums.get(1);
//            z=nums.get(2);
//        }
//        String sign="";
//        int sum=0;
//        if (x+y>=z){
//            sign=Integer.toString((x+y)-z);
//        }else {
//            sign="Impossible";
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson 0539 Торт
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String srt=in.nextLine();
//        StringTokenizer st=new StringTokenizer(srt," ");
//        int num = 0;
//        while (st.hasMoreTokens()){
//            num=Integer.valueOf(st.nextToken());
//        }
//        String sign="";
//        if (num==1){
//            sign="0";
//        } else if (num%2==0){
//            sign=Integer.toString(num/2);
//        }else if (num%2==1){
//            sign=Integer.toString(num);
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();

        //Lesson 0754 Три Толстяка
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Integer> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(Integer.valueOf(st.nextToken()));
//        }
//        int min=94;
//        int max=727;
//        String sign="";
//        boolean yes=false;
//        nums.sort(Collections.reverseOrder());
//        for (int i = 0; i < nums.size(); i++) {
//            if (min>nums.get(i) || max<nums.get(i)){
//                yes=true;
//            }else {
//                sign=Integer.toString(nums.get(0));
//            }
//        }
//        if (yes){
//            sign="Error";
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson 0004 Игра
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        int num=0;
//        while (st.hasMoreTokens()){
//            num=Integer.valueOf(st.nextToken());
//        }
//        int nine=9;
//        int last=nine-num;
//        String first=Integer.toString(Integer.parseInt(num+""+nine+""+""+last));
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(first);
//        writer.close();


                     //Lesson 0106 Монетки
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        ArrayList<Integer> nums=new ArrayList<>();
//        String str;
//        while (in.hasNextLine()){
//            str=in.nextLine();
//            nums.add(Integer.valueOf(str));
//        }
//        int zero=0;
//        int one=0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (i>0) {
//                if (nums.get(i) == 0) {
//                    zero++;
//                } else if (nums.get(i) == 1) {
//                    one++;
//                }
//            }
//        }
//        int count[]=new int[]{zero,one};
//        int min=count[0];
//        for (int i = 0; i < count.length; i++) {
//            if (min>=count[i]){
//                min=count[i];
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(min));
//        writer.close();


        //Lesson 0149 Разворот
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        ArrayList<String> nums=new ArrayList<>();
//        String str;
//        while (in.hasNextLine()){
//            str=in.nextLine();
//            nums.add(str);
//        }
//
//        ArrayList<Integer> allNums=new ArrayList<>();
//        for (String i : nums){
//            StringTokenizer st=new StringTokenizer(i," ");
//            while (st.hasMoreTokens()){
//                allNums.add(Integer.valueOf(st.nextToken()));
//            }
//        }
//        ArrayList<Integer> reverse=new ArrayList<>();
//        for (int i = allNums.size()-1;i>=0;i--) {
//            if (i>0){
//                reverse.add(allNums.get(i));
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        for (int i = 0; i < reverse.size(); i++) {
//            writer.write(String.valueOf(reverse.get(i))+" ");
//        }
//        writer.close();


        //Lesson 0892 Время года
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        ArrayList<Integer> nums=new ArrayList<>();
//        String str=in.nextLine();
//        int num=0;
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            num=Integer.valueOf(st.nextToken());
//        }
//        String sign="";
//        if (num==1 || num==2 || num==12){
//            sign="Winter";
//        }else if (num==3 || num==4 || num==5){
//            sign="Spring";
//        }else if (num==6 || num==7 || num==8){
//            sign="Summer";
//        }else if (num==9 || num==10 || num==11){
//            sign="Autumn";
//        }else {
//            sign="Error";
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson 0819 Прямоугольный параллелепипед
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Long> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(Long.valueOf(st.nextToken()));
//        }
//        long v=nums.get(0)*nums.get(1)*nums.get(2);
//        long p=(nums.get(0)* nums.get(1)+ nums.get(1)* nums.get(2) + nums.get(0)* nums.get(2))*2;
//        String qw=p+" "+v;
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(qw);
//        writer.close();


        //Lesson 0324	Четырехзначный палиндром
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        String num="";
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            num=st.nextToken();
//        }
//        String num1="";
//        for (int i=num.length()-1;i>=0;i--){
//            num1=num1+num.charAt(i);
//        }
//        String sign="";
//        if (num1.equals(num)){
//            sign="YES";
//        }else {
//            sign="NO";
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson  0606	Треугольник - 3
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Integer> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(Integer.valueOf(st.nextToken()));
//        }
//        String sign="";
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(0)+ nums.get(1)> nums.get(2) && nums.get(0)+ nums.get(2)> nums.get(1) && nums.get(2)+ nums.get(1)> nums.get(0)){
//                sign="YES";
//            }else {
//                sign="NO";
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson  0697	Ремонт
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        ArrayList<Integer> length=new ArrayList<>();
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            length.add(Integer.valueOf(st.nextToken()));
//        }
//        int result = (2 * (length.get(0) * length.get(2) + length.get(1) * length.get(2))) / 16;
//        if((2 * (length.get(0) * length.get(2) + length.get(1) * length.get(2))) % 16 != 0){
//            result = result + 1;
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();


        //Lesson 0529	Длина отрезка
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Double> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(Double.valueOf(st.nextToken()));
//        }
//        double q= (nums.get(2)- nums.get(0)) * (nums.get(2)- nums.get(0));
//        double e=(nums.get(3)- nums.get(1)) * (nums.get(3)- nums.get(1));
//        double r=Math.sqrt(e+q);
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(r));
//        writer.close();

        //Lesson  0854	Кондиционер
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str;
//        ArrayList<String> alls=new ArrayList<>();
//        while (in.hasNextLine()){
//            str=in.nextLine();
//            StringTokenizer st=new StringTokenizer(str," ");
//            while (st.hasMoreTokens()){
//                alls.add(st.nextToken());
//            }
//        }
//        int room=Integer.valueOf(alls.get(0));
//        int cond=Integer.valueOf(alls.get(1));
//        String what=" ";
//        if (alls.get(2).equals("fan")){
//            what=String.valueOf(room);
//        }else if (alls.get(2).equals("heat") && room<cond){
//            what=String.valueOf(cond);
//        }else if (alls.get(2).equals("heat") && room>cond){
//            what=String.valueOf(room);
//        }else if (alls.get(2).equals("freeze") && room<cond){
//            what=String.valueOf(room);
//        }else if (alls.get(2).equals("freeze") && room>cond){
//            what=String.valueOf(cond);
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(what);
//        writer.close();


        //Lesson 0052	Счастливый билет
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        String num=" ";
//        while (st.hasMoreTokens()){
//            num=st.nextToken();
//        }
//        char[] charArray=num.toCharArray();
//        int one=Character.getNumericValue(charArray[0]);
//        int two=Character.getNumericValue(charArray[1]);
//        int three=Character.getNumericValue(charArray[2]);
//        int four=Character.getNumericValue(charArray[3]);
//        int five=Character.getNumericValue(charArray[4]);
//        int six=Character.getNumericValue(charArray[5]);
//        int avr=one+two+three;
//        int avr2=four+five+six;
//        String sign="";
//        if (avr==avr2){
//            sign="YES";
//        }else {
//            sign="NO";
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson  0933	Телефон
//        public class Main {
//
//            private static long result;
//            private static ArrayList<Long> data = new ArrayList<>();
//            private static void in(){ // обработка входных данных
//                String str;
//                FileReader file = null;
//                try {
//                    file = new FileReader("input.txt");
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                Scanner sc = new Scanner(Objects.requireNonNull(file)); // Если есть файл
//                str = sc.nextLine();
//                StringTokenizer st = new StringTokenizer(str, " ");
//                while (st.hasMoreTokens()){
//                    data.add(Long.valueOf(st.nextToken()));
//                }
//            }
//
//            private static void out() throws IOException { // Выходные данные
//                FileWriter fileOut = null;
//                try {
//                    fileOut = new FileWriter("output.txt");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                Objects.requireNonNull(fileOut).write(String.valueOf(result));
//                fileOut.close();
//            }
//
//            public static void main(String[] args) throws IOException {
//                in();
//                result = (data.get(3) >= data.get(0)) ? data.get(0) * data.get(1) + (data.get(3) - data.get(0)) * data.get(2) : data.get(3) * data.get(1);
//                System.out.println(result);
//                out();
//
//            }
//        }


        //Lesson  0023	Гадание
//        ArrayList<Integer> numbers = new ArrayList<>();
//        int result = 0;
//        int str;
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        str = Integer.valueOf(sc.nextLine());
//        for(int i = 1000; i >= 1; i--){
//            if(str%i == 0){
//                numbers.add(str/i);
//            }
//        }
//        for(Integer i : numbers){
//            result += i;
//        }
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(result));
//        fileOut.close();


        //Lesson 0940	Орфография
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<String> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(st.nextToken());
//        }
//        int first=Integer.valueOf(nums.get(0));
//        StringBuilder word1=new StringBuilder(nums.get(1));
//        word1.deleteCharAt(first-1);
//        System.out.println(word1);
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(word1));
//        writer.close();


        //Lesson  0948	Строки в книге
//        ArrayList<Integer> numberIn = new ArrayList<>();
//        ArrayList<Integer> numberOut = new ArrayList<>();
//        StringBuilder result = null;
//        String str;
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while (st.hasMoreTokens()){
//            numberIn.add(Integer.valueOf(st.nextToken()));
//        }
//        if(numberIn.get(1) % numberIn.get(0) != 0){ // Если это не последняя строка на странице
//            numberOut.add(numberIn.get(1) / numberIn.get(0) + 1); // Расчет страницы
//            numberOut.add(numberIn.get(1) % numberIn.get(0)); // Расчет строки
//        }else{ // Если последняя
//            numberOut.add(numberIn.get(1) / numberIn.get(0)); // Расчет страницы
//            numberOut.add(numberIn.get(1) / numberOut.get(0)); // Расчет строки
//        }
//
//        for (Integer aNumberOut : numberOut) {
//            if (result != null) {
//                result.append(String.valueOf(aNumberOut)); // Вторая цифра
//            } else {
//                result = new StringBuilder(String.valueOf(aNumberOut) + " "); // Пробел после 1 цифры
//            }
//        }
//        System.out.println(result);
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(result));
//        fileOut.close();


        //Lesson  0233	Автобусная экскурсия
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        ArrayList<String> nums1=new ArrayList<>();
//        while (in.hasNextLine()){
//            nums1.add(in.nextLine());
//        }
//        ArrayList<Integer> nums=new ArrayList<>();
//        StringTokenizer st=new StringTokenizer(nums1.get(1)," ");
//        while (st.hasMoreTokens()){
//            nums.add(Integer.valueOf(st.nextToken()));
//        }
//        int bridgeNumber=0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i)<=437){
//                bridgeNumber=i+1;
//                break;
//            }
//        }
//        String result="";
//        if (bridgeNumber==0){
//            result="No Crash";
//        }else {
//            result="Crash "+bridgeNumber;
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(result);
//        writer.close();



        //Lesson 0839	Всем известно
        // FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String num="";
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            num=st.nextToken();
//        }
//
//        ArrayList<Integer> allNums=new ArrayList<>();
//        char[] charArray=num.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            allNums.add(Character.getNumericValue(charArray[i]));
//        }
//
//        String sign="";
//        for (int i = 0; i < allNums.size(); i++) {
//            if (allNums.get(i)==0){
//                sign="NO";
//                break;
//            }else {
//                sign="YES";
//            }
//        }
//
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(sign);
//        writer.close();


        //Lesson  0685	Золотой песок
//        ArrayList<Integer> price = new ArrayList<>();
//        ArrayList<Integer> container = new ArrayList<>();
//        int profit = 0;
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while (st.hasMoreTokens()){
//            if(price.size() < 3){
//                price.add(Integer.valueOf(st.nextToken())); // Записывавем цены
//            }else{
//                container.add(Integer.valueOf(st.nextToken())); // Записываем емкость
//            }
//        }
//        Collections.sort(price); // Сортируем цены
//        Collections.sort(container); // Сортируем емкости
//        for(int i = 0; i<price.size(); i++){
//            profit = profit + price.get(i) * container.get(i); // Перемножаем минимальные цены с минимальными емкостями
//        }
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(profit));
//        fileOut.close();


        //Lesson 0757	Спирт
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Long> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(Long.valueOf(st.nextToken()));
//        }
//        long c=2;
//        long h=6;
//        long o=1;
//        long result=0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(0)<c || nums.get(1)<h || nums.get(2)<o){
//                result=0;
//            }else if (nums.get(0)==c && nums.get(1)==h && nums.get(2)==o){
//                result=1;
//            }else if (nums.get(0)>c || nums.get(1)>h || nums.get(2)>o){
//                long c1=nums.get(0)/c;
//                long h1=nums.get(1)/h;
//                long o1=nums.get(2)/o;
//                ArrayList<Long> alls=new ArrayList<>();
//                alls.add(c1);
//                alls.add(h1);
//                alls.add(o1);
//                Collections.sort(alls);
//                result=alls.get(0);
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();


        //Lesson  0504	Цветочки
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        int num=0;
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            num=Integer.valueOf(st.nextToken());
//        }
//        String g="G";
//        String c="C";
//        String v="V";
//        for (int i = 0; i < num; i++) {
//            String tempG =g;
//            String tempV=v;
//            v=c;
//            c=tempV;
//            g=c;
//            c=tempG;
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(g+""+""+c+""+v);
//        writer.close();



        //Lesson 0678 Напёрстки
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        String str = sc.nextLine();
//        char[] ch = str.toCharArray();
//        for(char aCh : ch){
//            actions.add(String.valueOf(Character.valueOf(aCh)));
//        }
//        changeThimble();
//        searchBall();
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(result));
//        fileOut.close();
//    }
//    private static ArrayList<Integer> letter = new ArrayList<>(Arrays.asList(1,2,3)); // Порядковый номер наперстков
//    private static int result = 0; // Переменная с результатом
//    private static ArrayList<String> actions = new ArrayList<>(); // Коллекция со всеми действиями
//    private static void changeThimble(){ // Поменять наперстки местами
//        for (String action : actions) {
//            switch (action) {
//                case "A": // Поменять левый и центральный
//                    // Промежуточная переменная
//                    int interim = letter.get(0);
//                    letter.set(0, letter.get(1));
//                    letter.set(1, interim);
//                    break;
//                case "B": // Поменять правый и центральный
//                    interim = letter.get(1);
//                    letter.set(1, letter.get(2));
//                    letter.set(2, interim);
//                    break;
//                default: // Поменять левый и правый
//                    interim = letter.get(0);
//                    letter.set(0, letter.get(2));
//                    letter.set(2, interim);
//                    break;
//            }
//        }
//    }
//    private static void searchBall(){ // Ищем наперсток с шариком
//        for(int i = 0; i < letter.size(); i++){
//            if(letter.get(i) == 1){
//                result = i+1;
//            }
//        }
//    }

        
        //Lesson 0086	Головоломка про ферзей
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        int num=Integer.valueOf(in.nextLine());
//        int result=0;
//        for (int i=num-2;i>0;i--){
//            result+=i;
//        }
//        result=result*2;
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();


        //Lesson 0131	Перепись
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        String str;
//        while (sc.hasNextLine()){
//            str = sc.nextLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            while (st.hasMoreTokens()){
//                data.add(Integer.valueOf(st.nextToken()));
//            }
//        }
//        dataValidation();
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(oldManNumber));
//        fileOut.close();
//
//    }
//    private static ArrayList<Integer> data = new ArrayList<>();
//    private static int oldManNumber = -1;
//    private static int manAge = 0;
//
//    private static void dataValidation(){ //
//        int j = 0; // Счетчик номера жильца
//        for (int i = 0; i < data.size(); i++){
//            if(data.get(i) != 0 && i % 2 == 1){
//                j++;
//            }
//            if(i % 2 == 1 && data.get(i+1) == 1 && i+1 < data.size()){ // Проверка возраста мужчины
//                if(data.get(i) > manAge){
//                    manAge = data.get(i);
//                    oldManNumber = j;
//                }
//            }
//        }
//    }


        //Lesson  0822	Площадь треугольника
//        ArrayList<Double> point = new ArrayList<>();
//        double a, b, c, p;
//        String str;
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            str = sc.nextLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            while (st.hasMoreTokens()){
//                point.add(Double.valueOf(st.nextToken()));
//            }
//        }
//        // Находим длины сторон треугольника
//        a = Math.sqrt(Math.pow(point.get(3) - point.get(1), 2) + Math.pow(point.get(2) - point.get(0), 2));
//        b = Math.sqrt(Math.pow(point.get(5) - point.get(3), 2) + Math.pow(point.get(4) - point.get(2), 2));
//        c = Math.sqrt(Math.pow(point.get(5) - point.get(1), 2) + Math.pow(point.get(4) - point.get(0), 2));
//        // Находим p для формулы Герона
//        p = (a + b + c) /2;
//        // Вычисляем площадь по формуле Герона, округляем до 2(!) знаков после запятой, используем тип BigDecimal для больших чисел
//        BigDecimal result = new BigDecimal(Math.sqrt(p * (p -a) * (p - b) * (p - c))).setScale(2,ROUND_HALF_UP);
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(result));
//        fileOut.close();



        //Lesson  0005 Статистика
//        getData();
//        evenOdd();
//        // Преобразовываем данные для вывода в файл
//        String four = (odd.size() <= even.size()) ? "YES" : "NO";
//        String oddString = String.valueOf(odd).replaceAll(", ", " ").replaceAll("^\\[|]$", "");
//        String evenString = String.valueOf(even).replaceAll(", ", " ").replaceAll("^\\[|]$", "");
//        String result = oddString + "\n" + evenString + "\n" + four;
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(result);
//        fileOut.close();
//
//    }
//    private static ArrayList<String> data = new ArrayList<>(); // Данные построчно
//    private static ArrayList<Integer> day = new ArrayList<>(); // Все дни недели
//    private static ArrayList<Integer> even = new ArrayList<>(); // Четные дни
//    private static ArrayList<Integer> odd = new ArrayList<>(); // Нечетные дни
//    private static void getData() throws IOException{ // Получаем данные
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            data.add(sc.nextLine());
//        }
//        StringTokenizer st = new StringTokenizer(data.get(1), " ");
//        while (st.hasMoreTokens()){
//            day.add(Integer.valueOf(st.nextToken()));
//        }
//    }
//    private static void evenOdd(){ // Определяем четное или нечетное число, записываем в соответствующую коллекцию
//        for(Integer line : day){
//            if(line % 2 == 0){
//                even.add(line);
//            }else{
//                odd.add(line);
//            }
//        }
//    }


        //Lesson 0327	В одном шаге от счастья
//        ArrayList<String> data = new ArrayList<>();
//        ArrayList<String> happiniessTicket = new ArrayList<>();
//        String result;
//        FileReader file = null;
//        try {
//            file = new FileReader("input.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            data.add(sc.nextLine());
//        }
//        for(String line : data){
//            numberCount =  line.length(); // Определить длину данных в коллекции
//            if(numberCount == 6){ // Если это номер билета
//                numberTicketPlus(line);
//                numberTicketMinus(line);
//                if (numberLeftNext == numberRightNext || numberLeftPrev == numberRightPrev) { // Если предыдущий или следующий билет счастливый
//                    happiniessTicket.add("Yes");
//                } else {
//                    happiniessTicket.add("No");
//                }
//            }
//        }
//        result = String.valueOf(happiniessTicket).replaceAll(", ", "\n").replaceAll("^\\[|]$", "");
//        FileWriter fileOut = null;
//        try {
//            fileOut = new FileWriter("output.txt");
//            fileOut.write(result);
//            fileOut.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static int numberCount;
//    private static String number;
//    private static int numberLeftNext;
//    private static int numberLeftPrev;
//    private static int numberRightNext;
//    private static int numberRightPrev;
//
//
//    private static void numberTicketPlus(String line){ // Проверка следующего билета
//        numberCount = Integer.valueOf(line) + 1;
//        number = String.valueOf(numberCount);
//        number = (number.length() == 1) ? "00000"+number: // Дописываем нули вперед
//                (number.length() == 2) ? "0000" + number:
//                        (number.length() == 3) ? "000" + number:
//                                (number.length() == 4) ? "00" + number:
//                                        (number.length() == 5) ? "0" + number : number;
//
//        char[] ch = number.toCharArray();
//        numberLeftNext = (ch[0] - '0') + (ch[1] - '0') + (ch[2] - '0');
//        numberRightNext = (ch[3] - '0') + (ch[4] - '0') + (ch[5] - '0');
//    }
//    private static void numberTicketMinus(String line){ // Проверка предыдущего билета
//        numberCount = Integer.valueOf(line) - 1;
//        number = String.valueOf(numberCount);
//        number = (number.length() == 1) ? "00000"+number: // Дописываем нули вперед
//                (number.length() == 2) ? "0000" + number:
//                        (number.length() == 3) ? "000" + number:
//                                (number.length() == 4) ? "00" + number:
//                                        (number.length() == 5) ? "0" + number : number;
//
//        char[] ch2 = number.toCharArray();
//        numberLeftPrev = (ch2[0] - '0') + (ch2[1] - '0') + (ch2[2] - '0');
//        numberRightPrev = (ch2[3] - '0') + (ch2[4] - '0') + (ch2[5] - '0');
//    }



        //Lesson 0929 Игральные кубики
//        FileReader reader=null;
//        try {
//            reader=new FileReader("input.txt");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        Scanner in=new Scanner(reader);
//        long num=0;
//        while (in.hasNextLine()){
//            num=Long.valueOf(in.nextLine());
//        }
//
//        long min=0;
//        if (num==6){
//            min=1;
//        }else if (num<6){
//            if (num==1){
//                min=6;
//            }else if (num==2){
//                min=5;
//            }else if (num==3){
//                min=4;
//            }else if (num==4){
//                min=3;
//            }else if (num==5){
//                min=2;
//            }
//        }else if (num>6){
//            long div=num/6;
//            long div1=num % 6;
//            long min1=0;
//            if (div1==1){
//                min1=6;
//            }else if (div1==2){
//                min1=5;
//            }else if (div1==3){
//                min1=4;
//            }else if (div1==4){
//                min1=3;
//            }else if (div1==5){
//                min1=2;
//            }else {
//                min1=0;
//            }
//            min=div+min1;
//        }
//
//        long max=num*6;
//
//        System.out.println(min+" "+max);
//        FileWriter writer=null;
//        try {
//            writer=new FileWriter("output.txt");
//            writer.write(min+" "+max);
//            writer.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }



        //Lesson 0894	Кольцо
//        getData();
//        double r = Math.sqrt((Math.PI * Math.pow(data.get(1), 2) - data.get(0)) / Math.PI); // Используем формулу нахождения площади кольца
//        String rformat = String.format("%.3f", r).replaceAll(",", "."); // Приводим число к нужному формату
//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter(new File("output.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        pw.print(String.valueOf(rformat));
//        pw.close();
//    }
//    private static ArrayList<Double> data = new ArrayList<>();
//    private static void getData() throws IOException{ // Получение данных
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        String str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while (st.hasMoreTokens()){
//            data.add(Double.valueOf(st.nextToken()));
//        }


        //Lesson 0297	Кругляши
//        FileReader reader=null;
//        try {
//            reader=new FileReader("input.txt");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        String num="";
//        Scanner in=new Scanner(reader);
//        num=in.nextLine();
//        char[] charArray=num.toCharArray();
//        int result=0;
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i]=='0'){
//                result=result+1;
//            }else if (charArray[i]=='6' || charArray[i]=='9'){
//                result=result+1;
//            }else if (charArray[i]=='8'){
//                result=result+2;
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();

        //Lesson 0043	Нули
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String letters=in.nextLine();
//        char[] charArray=letters.toCharArray();
//        int c=0;
//        int max=0;
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i]=='0'){
//                c=c+1;
//            }else {
//                c=0;
//            }
//            if (c>max){
//                max=c;
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(max));
//        writer.close();


        //Lesson 0263	Метро
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        ArrayList<Integer> nums=new ArrayList<>();
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            nums.add(Integer.valueOf(st.nextToken()));
//        }
//        Collections.sort(nums);
//        int result1=nums.get(1)-nums.get(0);
//        int result2=nums.get(2)-result1;
//        int result=0;
//        if (result1>result2){
//            result=result2-1;
//        }else {
//            result=result1-1;
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();


        //Lesson 0844	Поля
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        StringTokenizer st=new StringTokenizer(str," ");
//        ArrayList<Long> nums=new ArrayList<>();
//        while (st.hasMoreTokens()){
//            nums.add(Long.valueOf(st.nextToken()));
//        }
//        long res=nums.get(0)*nums.get(1);
//        long res1= (int) Math.sqrt(res);
//
//        long result=0;
//        if (res==res1*res1){
//            result=res1;
//        }else{
//            result=0;
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();


        //Lesson 0637 NEERC
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str;
//        ArrayList<String> letters=new ArrayList<>();
//        while (in.hasNextLine()){
//            letters.add(in.nextLine());
//        }
//        ArrayList<Integer> nums=new ArrayList<>();
//        StringTokenizer st=new StringTokenizer(letters.get(1)," ");
//        while (st.hasMoreTokens()){
//            nums.add(Integer.valueOf(st.nextToken()));
//        }
//        int classes=Integer.valueOf(letters.get(letters.size()-1));
//        int result=0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i)<=classes){
//                result=result+nums.get(i);
//            }else if (nums.get(i)>classes){
//                int res=nums.get(i)-classes;
//                int res1=nums.get(i)-res;
//                result=result+res1;
//            }
//        }
//        System.out.println(result);

        //Lesson 0817	Манхэттенские улицы
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        ArrayList<Long> nums=new ArrayList<>();
//        StringTokenizer st=new StringTokenizer(str," ");
//        while (st.hasMoreTokens()){
//            nums.add(Long.valueOf(st.nextToken()));
//        }
//        long amount=nums.get(0)*nums.get(1);
//        long form=nums.get(2)*nums.get(2);
//        long res=form*amount;
//        long amount1=nums.get(2)*nums.get(3);
//        long res1=(nums.get(0)+nums.get(1))*amount1;
//        long result=res1-res;
//
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(result));
//        writer.close();

        //Lesson 0264	Оттепель
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str;
//        ArrayList<Integer> nums=new ArrayList<>();
//        while (in.hasNextLine()){
//            str=in.nextLine();
//            StringTokenizer st=new StringTokenizer(str," ");
//            while (st.hasMoreTokens()){
//                nums.add(Integer.valueOf(st.nextToken()));
//            }
//        }
//        int res=0;
//        int max=0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (i>0){
//                if (nums.get(i)>0){
//                    res=res+1;
//                }else if (nums.get(i)<=0){
//                    res=0;
//                }
//                if (res>max){
//                    max=res;
//                }
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(max));
//        writer.close();


        //Lesson 0496 Сбор черники
//        getData();
//        for(int i = 0; i < berryCount.size(); i++){
//            if(i == 0){ // Убираем количество кустов
//                berryCount.remove(0);
//            }
//        }
//        berryCount.add(berryCount.get(0)); // Добавляем кол-во ягод на 1м кусте в конец коллекции
//        berryCount.add(berryCount.get(1)); // Добавляем кол-во ягод на 2м кусте в конец коллекции
//        int result = 0;
//        for(int i = 0; i < berryCount.size(); i++){
//            if(i+1 < berryCount.size() && i+2 < berryCount.size()){
//                result = berryCount.get(i) + berryCount.get(i+1) + berryCount.get(i+2); // Считаем количество ягод на 3х соседних кустах
//            }
//            berrySum.add(result);
//            result = 0;
//        }
//        berrySum.sort(Collections.reverseOrder()); // Сортируем последовательность с количеством ягод на 3 кустах в обратном порядке
//        result = berrySum.get(0);
//        PrintWriter pw = new PrintWriter(new File("output.txt"));
//        pw.print(String.valueOf(result));
//        pw.close();
//
//    }
//    private static ArrayList<Integer> berryCount = new ArrayList<>();
//    private static ArrayList<Integer> berrySum = new ArrayList<>();
//    private static void getData() throws IOException{
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            String str = sc.nextLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            while (st.hasMoreTokens()){
//                berryCount.add(Integer.valueOf(st.nextToken()));
//            }
//        }
//    }


        //Lesson 0014	НОК
//        Scanner i = new Scanner(System.in);
//        int a = i.nextInt(), b = i.nextInt();
//        int c = a, d = b;
//        while (a != b){ // Используется алгоритм Евклида
//            if(a > b) a = a - b;
//            else b = b - a;
//        }
//        int result = c / a * d;
//        PrintWriter o = new PrintWriter(System.out);
//        o.print(result);
//        o.flush();


        //Lesson 0340	Коробки
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str;
//        ArrayList<Integer> letters=new ArrayList<>();
//        while (in.hasNextLine()){
//            str=in.nextLine();
//            StringTokenizer st=new StringTokenizer(str," ");
//            while (st.hasMoreTokens()){
//                letters.add(Integer.valueOf(st.nextToken()));
//            }
//        }
//        ArrayList<Integer> nums1=new ArrayList<>(Arrays.asList(letters.get(0),letters.get(1),letters.get(2)));
//        ArrayList<Integer> nums2=new ArrayList<>(Arrays.asList(letters.get(3),letters.get(4),letters.get(5)));
//        Collections.sort(nums1);
//        Collections.sort(nums2);
//        String result="";
//        if (nums1.get(0)==nums2.get(0) && nums1.get(1)==nums2.get(1) && nums1.get(2)==nums2.get(2)){
//            result="Boxes are equal";
//        }else if (nums1.get(0)>=nums2.get(0) && nums1.get(1)>=nums2.get(1) && nums1.get(2)>=nums2.get(2)){
//            result="The first box is larger than the second one";
//        }else if (nums1.get(0)<=nums2.get(0) && nums1.get(1)<=nums2.get(1) && nums1.get(2)<=nums2.get(2)){
//            result="The first box is smaller than the second one";
//        }else {
//            result="Boxes are incomparable";
//        }
//
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(result);
//        writer.close();



        //Lesson 0002	Сумма
//        private static int data;
//        private static void getData() throws IOException{
//            FileReader file = new FileReader("input.txt");
//            Scanner sc = new Scanner(file);
//            data = sc.nextInt();
//        }
//        public static void main(String[] args) throws IOException {
//            getData();
//            int sum = 0;
//            if(data > 0){
//                for(int i = 0; i <= data; i++){
//                    sum += i;
//                }
//            }else{
//                for(int i = 1; i >= data; i--){
//                    sum += i;
//                }
//            }
//            PrintWriter pw = new PrintWriter(new File("output.txt"));
//            pw.print(String.valueOf(sum));
//            pw.close();


        //Lesson 0950	Сжатие бинарных последовательностей
//        ArrayList<String> symbols=new ArrayList<>();
//        FileReader reader=new FileReader("input.txt");
//        Scanner in=new Scanner(reader);
//        String str=in.nextLine();
//        char[] charArray=str.toCharArray();
//        for (char ch : charArray){
//            String st=String.valueOf(ch);
//            if (st.equals("1") || st.equals("0")){
//                symbols.add(st);
//            }
//        }
//        char[] abc={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        int k=0;
//        StringBuilder code=new StringBuilder();
//        for (String symbol : symbols){
//            if (symbol.equals("1")){
//                code.append(abc[k]);
//                k=0;
//            }else{
//                k++;
//            }
//        }
//        FileWriter writer=new FileWriter("output.txt");
//        writer.write(String.valueOf(code));
//        writer.close();


        //Lesson  0633	ACM World Finals
//        ArrayList<String> data = new ArrayList<>(); // Все данные
//        ArrayList<String> names = new ArrayList<>(); // Имена участников
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            data.add(sc.nextLine());
//        }
//        for(int i = 0; i < data.size(); i++){
//            if(i != 0){
//                names.add(data.get(i));
//            }
//        }
//        Collections.sort(names);
//        String result=data.get(0)+": "+String.join(", ",names);
//        PrintWriter pw = new PrintWriter(new File("output.txt"));
//        pw.print(result);
//        pw.close();


        //Lesson 0028	Симметрия
//        getData();
//        long x, y;
//        if(data.get(0).equals(data.get(2))){ // Если прямая параллельна y
//            x = data.get(0) + (data.get(2) - data.get(4));
//            y = data.get(5);
//        }else{ // Если прямая параллельна x
//            x = data.get(4);
//            y = data.get(1) + (data.get(3) - data.get(5));
//        }
//        String result = x + " " + y;
//        PrintWriter pw = new PrintWriter(new File("output.txt"));
//        pw.print(result);
//        pw.close();
//    }
//    private static ArrayList<Long> data = new ArrayList<>();
//    private static void getData() throws IOException{
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            String str = sc.nextLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            while (st.hasMoreTokens()){
//                data.add(Long.valueOf(st.nextToken()));
//            }
//        }
//    }



        //Lesson 0692	Бинарные числа
//        String out = "YES";
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        int strInt = Integer.valueOf(str);
//        if(strInt <= 0){
//            out = "NO";
//        }else{
//            while(strInt > 1){
//                if(strInt%2 == 0){ // Проверка четности остатка
//                    strInt = strInt / 2; // Следующее число
//                }else{
//                    out = "NO";
//                    break;
//                }
//            }
//        }
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(out);
//        fileOut.close();



        //Lesson 	0003	Пятью пять - двадцать пять!
//        long strInt;
//        long out;
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        strInt = Integer.valueOf(str);
//        out = (long) Math.pow(strInt, 2);
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(out));
//        fileOut.close();


        //Lesson  0066 Клавиатура
//        String result="";
//        String allButton = "qwertyuiopasdfghjklzxcvbnm"; // Все символы клавиатуры
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        char[] ch = allButton.toCharArray(); // Переписываем символы строки в массив
//        for(int i = 0; i < allButton.length(); i++){
//            if(str.equals(String.valueOf(ch[i]))){ // Если символ в строке совпал с символом из файла
//                if(i+1 < allButton.length()){ // Если есть еще 1 символ в строке
//                    result = String.valueOf(ch[i+1]); // Находим следующий символ
//                }else {
//                    result = String.valueOf(ch[0]); // Если в строке нет символов далее, то начать сначала
//                }
//            }
//        }
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(result);
//        fileOut.close();


        //Lesson 	0766	Орешки
//        String symbol;
//        ArrayList<Integer> number = new ArrayList<>();
//        String str;
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while(st.hasMoreTokens()){
//            number.add(Integer.valueOf(st.nextToken()));
//        }
//        symbol=(number.get(0)*number.get(1)>=number.get(2)) ? "YES" : "NO";
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(symbol);
//        fileOut.close();


        //Lesson 0756	Рыболовная сеть
//        int node = 1;
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while(st.hasMoreTokens()){
//            node = node * (Integer.valueOf(st.nextToken()) - 1);
//        }
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(node));
//        fileOut.close();


        //Lesson 0777	Будильник
//        ArrayList<Integer> time = new ArrayList<>();
//        int result;
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while (st.hasMoreTokens()){
//            time.add(Integer.valueOf(st.nextToken())); // Записать все элементы в коллекцию
//        }
//        result = (time.get(1) > time.get(0)) ? time.get(1) - time.get(0) : 12 + time.get(1) - time.get(0);
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(result));
//        fileOut.close();

        //Lesson 0312	Арифметическая прогрессия
//        ArrayList<Integer> data = new ArrayList<>(); // Входные данные
//        int step; // Шаг програессии
//        int result;  // Результат вычислений
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        String str = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        while (st.hasMoreTokens()){
//            data.add(Integer.valueOf(st.nextToken()));
//        }
//        step = data.get(1) - data.get(0); // Вычисление шага
//        result = data.get(0) + (data.get(2) - 1) * step; // Вычисление n-члена прогрессии
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(String.valueOf(result));
//        fileOut.close();


        //Lesson  0062	Клетки
//        ArrayList<String> coordinate = new ArrayList<>();
//        ArrayList<String> letter = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H"));
//        String cellColor = null;
//        FileReader file = new FileReader("input.txt");
//        Scanner sc = new Scanner(file);
//        String str = sc.nextLine();
//        char[] ch = str.toCharArray();
//        for(char aCh : ch){
//            coordinate.add(String.valueOf(Character.valueOf(aCh)));
//        }
//        for(int i = 0; i < letter.size(); i++){
//            if(letter.get(i).equals(coordinate.get(0))){
//                cellColor = ((i+1)%2 == 0 && Integer.valueOf(coordinate.get(1)) % 2 == 0) ? "BLACK" :
//                        ((i+1)%2 == 1 && Integer.valueOf(coordinate.get(1)) % 2 == 1)  ? "BLACK" : "WHITE";
//            }
//        }
//        FileWriter fileOut = new FileWriter("output.txt");
//        fileOut.write(Objects.requireNonNull(cellColor));
//        fileOut.close();


        //Lesson 0942	Олимпиада
//        String str;
//        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
//        Scanner sc = new Scanner(file);
//        while(sc.hasNextLine()){
//            str = sc.nextLine();
//            list.add(str);
//        }
//        StringTokenizer st = new StringTokenizer(list.get(1), " ");
//        while(st.hasMoreTokens()){
//            time.add(Integer.valueOf(st.nextToken()));
//        }
//        fiveKurs();
//        time();
//        threeKurs();
//        time();
//        oneKurs();
//
//        // Определение победителя
//        String winner = (taskCountOne > taskCountThree && taskCountOne > taskCountFive) ? "1" :
//                (taskCountThree > taskCountOne && taskCountThree > taskCountFive) ? "3" : "5";
//
//        if(taskCountOne == taskCountThree && taskCountOne > taskCountFive){
//            winner = (mistakeAllOne == mistakeAllThree) ? "1" :
//                    (mistakeAllOne > mistakeAllThree) ? "3" : "1";
//        }else if(taskCountOne == taskCountFive && taskCountOne > taskCountThree){
//            winner = (mistakeAllOne == mistakeAllFive) ? "1" :
//                    (mistakeAllOne > mistakeAllFive) ? "5" : "1";
//        }else if(taskCountThree == taskCountFive && taskCountThree > taskCountOne){
//            winner = (mistakeAllThree == mistakeAllFive) ? "3" :
//                    (mistakeAllThree > mistakeAllFive) ? "5" : "3";
//        }else{
//            if(taskCountOne == taskCountThree && taskCountOne == taskCountFive) {
//                winner = (mistakeAllOne == mistakeAllThree && mistakeAllOne == mistakeAllFive) ? "1" :
//                        (mistakeAllOne == mistakeAllThree && mistakeAllOne < mistakeAllFive) ? "1" :
//                                (mistakeAllThree == mistakeCountFive && mistakeAllThree < mistakeAllOne) ? "3" :
//                                        (mistakeAllOne == mistakeAllFive && mistakeAllOne < mistakeAllThree) ? "1" :
//                                                (mistakeAllFive < mistakeAllThree && mistakeAllFive < mistakeAllOne) ? "5" :
//                                                        (mistakeAllThree < mistakeAllFive && mistakeAllThree < mistakeAllOne) ? "3" : "1";
//            }
//        }
//        FileWriter countStepFinish = new FileWriter("output.txt");// Запись числа в файл
//        countStepFinish.write(winner);
//        countStepFinish.close();
//
//
//
//
//    }
//    private static ArrayList<String> list = new ArrayList<>(); // Коллекция для построчного считывания данных
//    private static ArrayList<Integer> time = new ArrayList<>(); // Коллекция для хранения времени на решение задач
//    private static int taskCountOne = 0, taskCountThree = 0, taskCountFive = 0; // Количество решенных задач
//    private static int mistakeCountOne = 0, mistakeCountThree = 0, mistakeCountFive = 0; // Количество штрафного времени по каждому заданию
//    private static int mistakeAllOne = 0, mistakeAllThree = 0, mistakeAllFive = 0; // Количество штрафного времени по каждому заданию
//    private static int maxTime = 300; // Максимальная продолжительность соревнований
//
//    private static void oneKurs(){
//        Collections.sort(time);
//        int one = 0;
//        for (Integer aTime : time) { // Расчет по первокурснику
//            if (one >= 0) {
//                one = maxTime - aTime;
//                maxTime = one;
//                taskCountOne++;
//                mistakeCountOne += aTime;
//                mistakeAllOne += mistakeCountOne;
//            } else {
//                break;
//            }
//        }
//    }
//
//    private static void threeKurs(){
//        Collections.reverse(time);
//        int three = 0;
//        for (Integer aTime : time) { // Расчет по третьекурснику
//            if (three >= 0) {
//                three = maxTime - aTime;
//                maxTime = three;
//                taskCountThree++;
//                mistakeCountThree += aTime;
//                mistakeAllThree += mistakeCountThree;
//            } else {
//                break;
//            }
//        }
//    }
//
//    private static void fiveKurs(){
//        int five = 0;
//        for (Integer aTime : time) { // Расчет по пятикурснику
//            if (five >= 0) {
//                five = maxTime - aTime;
//                maxTime = five;
//                taskCountFive++;
//                mistakeCountFive += aTime;
//                mistakeAllFive += mistakeCountFive;
//            } else {
//                break;
//            }
//        }
//    }
//
//    private static void time(){
//        maxTime = 300;
//    }


        //Lesson 0035	Конечные автоматы
//        String resultOut = null;
//        ArrayList<String> number = new ArrayList<>(); // Для данных из файла
//        ArrayList<String> result = new ArrayList<>(); // Для данных, полученных в результате вычислений
//        int resultInt;
//        String str;
//        FileReader file = null; // Считывание данных из файла
//        try {
//            file = new FileReader("input.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            str = sc.nextLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            while (st.hasMoreTokens()){
//                number.add(st.nextToken()); // Записать все элементы в коллекцию
//            }
//        }
//        int j = 1;
//        for(int i = 0; i < number.size(); i++){
//            if(i != 0 && j < number.size()){
//                int n = Integer.valueOf(number.get(j));
//                int m = Integer.valueOf(number.get(j + 1));
//                j = j + 2;
//                resultInt = 19* m + (n + 239)*(n + 366) / 2; // Формула из задачи
//                result.add(String.valueOf(resultInt));
//            }
//        }
//        for(String line : result)
//            if (resultOut != null) {
//                resultOut = String.format("%s%s", resultOut, MessageFormat.format("{0}\n", line)); // Записываем результат со второй строки
//            } else {
//                resultOut = line + "\n"; // Записываем результат в 1 строку
//            }
//        FileWriter fileOut = null;
//        try {
//            fileOut = new FileWriter("output.txt");
//            fileOut.write(resultOut);
//            fileOut.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }












    }
}




