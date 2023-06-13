import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.crypto.SealedObject;
import javax.sql.rowset.serial.SerialArray;;

import org.omg.CORBA.IntHolder;

public class Lista1 extends ListEmploy {

    public static void main(String[] args) {
        new FlowLayout();

        Lista1 L = new Lista1();
        Locale.setDefault(Locale.CANADA);
        List<String> id = new ArrayList<>();
        List<String> name = new ArrayList<>();

        Scanner read = new Scanner(System.in);
        System.out.print("how many employeer will be registered? ");
        int employ = read.nextInt();
        String idAnterior = "";
        String idpassado = "";
        for (int i = 0; i < employ; i++) {

            System.out.printf("employee #%d\n", i + 1);
            System.out.print("id: ");
            String ids = read.next();

            while (ids.equals(idAnterior)) {

                System.out.println("try other id.");
                System.out.print(": ");
                ids = read.next();

            }
            id.add(ids);
            idAnterior = ids;
            System.out.print("name: ");
            read.nextLine();
            name.add(read.nextLine());
            System.out.print("salary: ");
            L.getSalary().add(read.nextFloat());
            System.out.println("");

        }
        int a = 0;
        int sal = 0;
        boolean continued = true;
        while (continued) {

            System.out.print("Enter the id employee that will have salary increase: ");
            String ids = read.next();
            String search = id.stream().filter(x -> x.equals(ids)).findFirst().orElse("not");
            if (search.equals("not")) {
                System.out.println(search);
            } else {
                continued = false;
                a = id.indexOf(search);
                for (int i = 0; i < id.size(); i++) {
                    if (id.get(i).equals(ids)) {
                        sal = i;
                    }
                }
            }
        }
        // ve quanto de salario tem o id escolhido
        // System.out.println("local salary " + sal + " " + salary.get(sal));
        float resultSal = L.getSalary().get(sal);

        System.out.print("Enter the percentage: ");
        float porcentege = read.nextFloat();
        float rs = (float) ((porcentege * resultSal) / 100.0);
        L.getSalary().remove(sal);
        L.getSalary().add(sal, rs + resultSal);
        System.out.println("List of employees:\n");

        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i) + ", " + name.get(i) + ", " + L.tuString(i));

        }
    }

}
