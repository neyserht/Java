package neyser;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ################## LinkedList ##################
        LinkedList<String> linkedList = new LinkedList<>();
        // Agregar valores
        linkedList.add("LinkedList 1");
        linkedList.add("LinkedList 2");
        linkedList.add("LinkedList 4");
        System.out.println("LinkedList: "+linkedList);
        //Editar valores
        linkedList.set(0,"LinkedList 5");
        System.out.println("LinkedList: "+linkedList);
        //Eliminar valores
        linkedList.remove("LinkedList 2");
        System.out.println("LinkedList: "+linkedList);
        //Obtener un valor
        System.out.println("Obtener: "+linkedList.get(0));
        System.out.println();

        // ################## HashSet ##################
        HashSet<String> hashSet = new HashSet<>();
        // Agregar valores
        hashSet.add("Valor A");
        hashSet.add("Valor B");
        hashSet.add("Valor C");
        System.out.println("HashSet: "+hashSet);
        //Eliminar valores
        hashSet.remove("Valor B");
        System.out.println("HashSet: "+hashSet);
        //Obtener un valor
        System.out.println("Obtener HashSet: "+hashSet.contains("Valor A"));
        System.out.println();

        // ################## TreeSet ##################
        TreeSet<String> treeSet = new TreeSet<>();
        // Agregar valores
        treeSet.add("Valor T1");
        treeSet.add("Valor T2");
        treeSet.add("Valor T3");
        System.out.println("TreeSet: "+treeSet);
        //Eliminar valores
        treeSet.remove("Valor T2");
        System.out.println("TreeSet: "+treeSet);
        //Obtener un valor
        System.out.println("Obtener TreeSet: "+treeSet.contains("Valor T1"));
        System.out.println();

        // ################## LinkedHashSet ##################
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        // Agregar valores
        linkedHashSet.add("Valor LH1");
        linkedHashSet.add("Valor LH2");
        linkedHashSet.add("Valor LH3");
        System.out.println("LinkedHashSet: "+linkedHashSet);
        //Eliminar valores
        linkedHashSet.remove("Valor LH2");
        System.out.println("LinkedHashSet: "+linkedHashSet);
        //Obtener un valor
        System.out.println("Obtener LinkedHashSet: "+linkedHashSet.contains("Valor LH1"));
        System.out.println();

        // ################## HashMap ##################
        HashMap<Integer, String> hashMap = new HashMap<>();
        // Agregar valores
        hashMap.put(1,"Valor HM1");
        hashMap.put(2,"Valor HM2");
        hashMap.put(3,"Valor HM3");
        System.out.println("HashMap: "+hashMap);
        //Editar valores
        hashMap.replace(2,"Valor NHM2");
        System.out.println("HashMap: "+hashMap);
        //Eliminar valores
        hashMap.remove(1);
        System.out.println("HashMap: "+hashMap);
        //Obtener un valor
        System.out.println("Obtener HashMap: "+hashMap.get(2));
        System.out.println();

        // ################## TreeMap ##################
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // Agregar valores
        treeMap.put(1,"Valor TM1");
        treeMap.put(2,"Valor TM2");
        treeMap.put(3,"Valor TM3");
        System.out.println("TreeMap: "+treeMap);
        //Editar valores
        treeMap.replace(2,"Valor TT2");
        System.out.println("TreeMap: "+treeMap);
        //Eliminar valores
        treeMap.remove(1);
        System.out.println("TreeMap: "+treeMap);
        //Obtener un valor
        System.out.println("Obtener TreeMap: "+treeMap.get(2));
        System.out.println();

        // ################## LinkedHashMap ##################
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // Agregar valores
        linkedHashMap.put(1,"Valor LHM1");
        linkedHashMap.put(2,"Valor LHM2");
        linkedHashMap.put(3,"Valor LHM3");
        System.out.println("LinkedHashMap: "+linkedHashMap);
        //Editar valores
        linkedHashMap.replace(2,"Valor LHMV2");
        System.out.println("LinkedHashMap: "+linkedHashMap);
        //Eliminar valores
        linkedHashMap.remove(1);
        System.out.println("LinkedHashMap: "+linkedHashMap);
        //Obtener un valor
        System.out.println("Obtener LinkedHashMap: "+linkedHashMap.get(3));
        System.out.println();


    }
}