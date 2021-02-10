package ru.samsung.itschool.mdev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static Comparator<Worker> age_compare;

    public static void main(String[] args) throws IOException {

        /*
        Алгоритмы структуры данных

        Collections (Коллекции)
        1) Множества (Set - интерфейс)
        2) Списки (List-ы)
        3) Словари (Map-ы)

        Set-ы: множества. Уникальные элементы. Неупорядочены.
        List-ы: списки. Упорядоченное множество элементов
                        У каждого элемента есть номер.
        Map-ы: неупоряд. Есть имя у каждого элемента.
                         Данные хранятся в виде пары ключ-значения

        Реализации в Java:
        1) Set-ы: TreeSet, HashSet, SortedSet
        2) List-ы: ArrayList, LinkedList, ?Vector?, Stack
        3) Map-ы: TreeMap, HashMap, SortedMap, ?Hashtable?

         */

        int[] a = new int[10];

        ArrayList<String> list = new ArrayList<>(); // 10
        list.add("New"); // в конец списка
        list.add(0,"Old"); // в начало списка
        list.add(0,"Msk");
        list.set(1,"TTT");
        list.remove(1);

         // for() обычный цикл for для перебора
        for(String s: list) {
            System.out.println(s);
        }

        // Класс содержит методы по работе с массивами
        // Arrays

        int x[] = {234,3,35,2,5,23455,4534};
        Arrays.sort(x);
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<x.length;i++) c.add(x[i]);
        // 2,3,5,35!36!234,4534,23455
        int result = Collections.binarySearch(c,36);
        System.out.println(result);

        ArrayList<String> f = new ArrayList<>();
        Collections.addAll(f,"adfgadfg","adfgadfg","ddd");

        List<Integer> d = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      /*  while(true) {
            String s = r.readLine();
            if(s.isEmpty()) break;
            int z = Integer.parseInt(s);
            if(z % 2 == 0) {
                d.add(z);
            } else {
                d.add(0,z);
            }
        }
        for(Integer kk: d) System.out.print(kk + " ");
*/
        List<Integer> pp = new ArrayList<>();
        pp.add(333);
        pp.add(123);
        pp.add(3);
        pp.add(5);
        pp.add(10);
        for(int i=0;i<pp.size();i++) {
            if(pp.get(i)>10) {
                pp.remove(i--);
            }
        }

        List<Double> t = new ArrayList<>();
        Collections.addAll(t, 5.6,6.7,3.2);
        Double[] t_ = t.toArray(new Double[t.size()]);




        List<Worker> workers = new ArrayList<Worker>();
        workers.add(new Worker("Ivan",14));
        workers.add(new Worker("Oleg",15));
        workers.add(new Worker("Petr",23));
        workers.add(new Worker("Maria",8));
        workers.add(new Worker("Olga",27));



        age_compare = new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
               //StringBuilder
                return o1.getName().compareTo(o2.getName());
                //o1.getAge()-o2.getAge();
            }
        };
        Collections.sort(workers, age_compare);


        for(Worker w: workers)
            System.out.println(w.getName() +": " +w.getAge());






    }
}
