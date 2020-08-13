package be.vdab.collectionsExercise2019;

import be.vdab.collectionshfdstk20.Circle;
import be.vdab.collectionshfdstk20.GeometricObject;
import be.vdab.collectionshfdstk20.GeometricObjectComparator;
import be.vdab.collectionshfdstk20.Rectangle;

import java.util.Comparator;

public class TestGeos {
    public static void main(String[] args) {
        GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
                new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)};

        System.out.println("\nunsorted");

        for (GeometricObject geoObj: list1) {
            System.out.println(geoObj.getArea());
        }

        GeometricObject[] sortList = selectionSort(list1,new GeometricObjectComparator());

        System.out.println("\nsorted");
        for (GeometricObject geoObj: sortList) {
            System.out.println(geoObj.getArea());
        }
    }

    public static <E> E[] selectionSort(E[] list,
                                         Comparator<? super E> comparator) {
        E listElement;
        int dummy = 0;
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length ; j++) {
                if (comparator.compare(list[i],list[j]) > 0) {
                    listElement = list[i];
                    list[i] = list[j];
                    list[j] = listElement;
                }else{
                    dummy = 1;
                }
            }
        }
        return list;
    }
}
