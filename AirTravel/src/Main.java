
public class Main {
    public static void main(String[] args) {
//exampleAirplane();
exampleDirigable();
exampleRocket();
exampleArray();

        //Создать конкретные классы:
        //Самолет,
        //Вертолет,
        //Дирижабль
        //
        //попробовать путешествоать каждым из них

        }
        private static void exampleArray(){
        AirTransport[] transports = {
        new Airplane( "Антоша", 14000), new Helicopter( "Крокодил", 1490), new Rocket("dfds",3443), new Airplane("flkdfl", 2344)};
        for (AirTransport x:transports)
            x.travelByAir( "A", "B");
        };

        private static void exampleAirplane(){
        Airplane airplane = new Airplane( "илюша", 19800);
        airplane.travelByAir("Диксон", "Хатанга");
        }
        private static void exampleDirigable(){
        Dirijable dirijable = new Dirijable("Гинденбург", 3000);
        dirijable.travelByAir( "Фридрихмайне", "Лекхерст");
        }
        private static void exampleRocket(){
        Rocket rocket=new Rocket("Пегас", 256000);
        }
    }

