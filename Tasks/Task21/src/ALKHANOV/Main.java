package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
public class Main {
    public static void main(String[] args) {
        Program program01 = new Program("В мире животных");
        Program program02 = new Program("Новости");
        Program program03= new Program("Время");
        Program program04= new Program("Вечерний Ургант");
        Program program05= new Program("Пусть помолчат");
        Channel firsttv = new Channel("Канал Первый");
        firsttv.addProgram(program01);
        firsttv.addProgram(program02);
        firsttv.addProgram(program03);
        firsttv.addProgram(program04);
        firsttv.addProgram(program05);

        Program program1 = new Program("Comedy");
        Program program2 = new Program("Битва Экстрасенсов");
        Program program3 = new Program("Сериал");
        Program program4 = new Program("Полицейский с рублевки");
        Program program5 = new Program("Песни на тнт");
        Channel tnt = new Channel("Канал тнт");
        tnt.addProgram(program1);
        tnt.addProgram(program2);
        tnt.addProgram(program3);
        tnt.addProgram(program4);
        tnt.addProgram(program5);

        TV tv = new TV();
        tv.addChannel(firsttv);
        tv.addChannel(tnt);

        RemoteController remoteController = new RemoteController(tv);
        remoteController.pressButton(2);

    }
}
