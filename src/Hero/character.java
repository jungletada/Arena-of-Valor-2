package Hero;
public abstract class character {
    public int HP;
    public int MP;
    public int Exp;
    public int range;
    public char name;
    public int x,y;
    public double distance;
    public boolean beAttacked;
    public character() {
        Exp = 0;
        HP = 100;
        MP = 50;
        beAttacked=false;
    }
    public boolean Isalive(){
        if (HP<=0)
            return false;
        return true;
    }
    public void ShowInfo(){
        System.out.println("Hero_"+name+" --- HP: "+HP+" MP: "+MP+" Exp: "+Exp);
    }
    public double getDistance(character p){
        distance=(x-p.x)*(x-p.x)+(y-p.y)*(y-p.y);
        distance=Math.sqrt(distance);
        return distance;
    }
    public void Move(int direction,battlefield f) {
        switch (direction){
            case 1:if(f.field[x][y-1]==' '){
                f.field[x][y]=' '; y--; f.field[x][y]=name; break;
            }
            case 2:if(f.field[x-1][y]==' '){
                f.field[x][y]=' ';x--; f.field[x][y]=name; break;
            }
            case 3:if(f.field[x][y+1]==' '){
                f.field[x][y]=' ';y++; f.field[x][y]=name; break;
            }
            case 4:if(f.field[x+1][y]==' '){
                f.field[x][y]=' ';x++; f.field[x][y]=name; break;
            }
        }
    }
}
interface skill{
    void ActiveSkill(character p);
    void PassiveSkill();
    void Setlocation(int i,int j);
    void Attacking(character be);

}
//------------------------------------------------
class HeroA extends character implements skill{
    public HeroA(){ name='A'; range=16;}
    public void Setlocation(int i,int j){
       x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    //the range can be infinity
    public void Attacking(character be){
        if(MP>=20){
            be.HP-=20;
            MP-=20;
            Exp+=20;
        }
    }
}
//-----------------------------------------------
class HeroB extends character implements skill{
    public HeroB(){ name='B'; range=2;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){
        p.HP-=10;
        this.MP-=20;
        this.Exp+=20;
    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=5) MP-=5;
        if(getDistance(be)<=range){
            be.HP-=15;
            Exp+=15;
        }
    }
}
class HeroC extends character implements skill{
    public HeroC(){ name='C';range=4;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=10) MP-=10;
        if(getDistance(be)<=range){
        be.HP-=20;
        Exp+=20;
        }
    }
}
class HeroD extends character implements skill{
    public HeroD(){ name='D';range=1;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=10) MP-=10;
        if(getDistance(be)<=range) {
            be.HP -= 30;
            Exp += 20;
        }
    }
}
class HeroE extends character implements skill{
    public HeroE(){ name='E';range=1;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=20) MP-=20;
        if(getDistance(be)<=range) {
            be.HP -= 35;
            Exp += 20;
        }
    }
}
class HeroF extends character implements skill{
    public HeroF(){ name='F';range=2;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=20) MP-=20;
        if(getDistance(be)<=range) {
            be.HP -= 25;
            Exp += 25;
        }
    }
}
class HeroG extends character implements skill{
    public HeroG(){ name='G';range=3;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=15) MP-=15;
        if(getDistance(be)<=range) {
            be.HP-=20;
            Exp+=20;
        }

    }
}
class HeroH extends character implements skill{
    public HeroH(){ name='H';range=2;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=15) MP-=15;
        if(getDistance(be)<=range) {
            be.HP -= 20;
            Exp += 20;
        }
    }
}
class HeroI extends character implements skill{
    public HeroI(){ name='I';range=1;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=10) MP-=10;
        if(getDistance(be)<=range) {
            be.HP -= 20;
            Exp += 20;
        }
    }
}
class HeroJ extends character implements skill{
    public HeroJ(){ name='J';range=6;}
    public void Setlocation(int i,int j){
        x=i; y=j;
    }
    public void ActiveSkill(character p){

    }
    public void PassiveSkill(){

    }
    public void Attacking(character be){
        if(MP>=30) MP-=30;
        if(getDistance(be)<=range) {
            be.HP -= 20;
            Exp += 20;
        }
    }
}
