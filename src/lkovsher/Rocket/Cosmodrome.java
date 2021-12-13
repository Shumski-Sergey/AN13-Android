package lkovsher.Rocket;

import lkovsher.Robot.legs.ILeg;

public class Cosmodrome  {

    void launch(IStart start){
        if(start.prelaunchSystemCheck()){
            start.engineStart();
            for(int i = 0; i < 11; i++){
                System.out.println(i);
            }
            start.start();
        } else System.out.println("Предстартовая проверка провалена!");
    }
}
