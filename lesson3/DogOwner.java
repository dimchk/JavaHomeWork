package lesson3;

public class DogOwner extends Owner {
        public void voiceCommand()
        {
            if(getPet() instanceof  Cat)
            {
                System.out.println("Alergic and dead");
            }
            else{
                getPet().voice();
            }
        }
}
