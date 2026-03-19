package ro.ase.cts.main;

import ro.ase.cts.builderV1.AbstractBuilder;
import ro.ase.cts.builderV1.Internare;
import ro.ase.cts.builderV1.InternareBuilder;
import ro.ase.cts.builderV2.AbstractBuilderV2;
import ro.ase.cts.builderV2.InternareBuilderV2;

public class Main {
    public static void main(String[] args){
        Internare i1 = new Internare();
        i1.setNumePacient("Georgel");
        i1.setPatRabatabil(true);

        Internare i2 = new Internare();
        i2.setNumePacient("Georgica");
        i2.setHalatInterior(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");
        Internare i3 = builder.setPatRabatabil(true).build();
        Internare i4 = builder.setPapuci(true).setNume("Gigel").build();
        System.out.println(i3.toString());
        System.out.println(i4.toString());

        AbstractBuilderV2 builderV2 = new InternareBuilderV2();
        builderV2.setMicDejun(true);
        ro.ase.cts.builderV2.Internare i5 = builderV2.build("Gigi");
        ro.ase.cts.builderV2.Internare i6 = builderV2.build("Gigica");

        i5.setHalatInterior(true);
        i5.setPapuciCamera(true);
        System.out.println(i5.toString());
        System.out.println(i6.toString());

    }
}
