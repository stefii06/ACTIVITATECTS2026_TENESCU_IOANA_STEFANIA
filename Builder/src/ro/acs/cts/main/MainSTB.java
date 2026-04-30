package ro.acs.cts.main;

import ro.acs.cts.STB.stb01.AbstractSTB;
import ro.acs.cts.STB.stb01.AutobuzLinie;
import ro.acs.cts.STB.stb01.BuilderSTB;
import ro.acs.cts.STB.stb02.AbstractSTB02;
import ro.acs.cts.STB.stb02.AutobuzLinie02;
import ro.acs.cts.STB.stb02.BuilderSTB02;

public class MainSTB {
    public static void main(String[] args) {


        AbstractSTB builder = new BuilderSTB("mercedez", "Ion");
        AutobuzLinie autobuzLinie1 = builder.set_oprireCapatLinie(true).build();
        AutobuzLinie autobuzLinie2 = builder.set_oprireCapatLinie(true).build();
        System.out.println(autobuzLinie1.toString());
        System.out.println(autobuzLinie2.toString());

        autobuzLinie2.setTextDerulator(true);
        System.out.println(autobuzLinie2.toString());

        AbstractSTB02 builder2 = new BuilderSTB02();
        builder2.set_textDerulator(true);
        builder2.set_oprireCapatLinie(true);
        AutobuzLinie02 autobuzLinie3 = builder2.build("Dacia", "Pavel");
        AutobuzLinie02 autobuzLinie4 = builder2.build("Logan", "Andrei");

        System.out.println(autobuzLinie3.toString());
        System.out.println(autobuzLinie4.toString());

        autobuzLinie3.setTextDerulator(true);
        autobuzLinie4.setTextDerulator(false);

        System.out.println(autobuzLinie3.toString());
        System.out.println(autobuzLinie4.toString());
    }
}
