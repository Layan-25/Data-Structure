package Lab8;
    public class HashMap {
    public Enter [] array;
    public int counter;

    public HashMap() {
        this.array = new Enter[16];
        this.counter = 0;
    }

    public int hashFunction ( int key, int i ){
        int x1 = key %array.length;
        int x2 = 7-key % 7;
        return (x1+ i *x2)%array.length;
    }

    public void put ( int key, String value ){
        if( counter != array.length){
            for( int i = 0; i < array.length ; i++ ){
                int index = hashFunction ( key, i);
                if(array[index] != null ){
                if( key == array [index].getKey()){
                    break;
                }
            }else{
                    array[index] = new Enter(key, value);
                    counter++;
                    break;
                }
            }
        }
        //print();
    }

    public void set ( int key, String value ){
        if( counter != array.length){
            for( int i = 0; i < array.length ; i++ ){
                int index = hashFunction ( key, i);
                if(array[index] != null ){
                if( key == array [index].getKey()){
                    array[index].setValue(value);
                } 
            }else {
                    break;
                }
            }
        }
    }

    public String get ( int key ){
if( counter != array.length){
            for( int i = 0; i < array.length ; i++ ){
                int index = hashFunction ( key, i);
                if(array[index] != null ){
                if( key == array [index].getKey()){
                    array[index].getValue();
                    break; 
               } } else {
                    break;
                }
            }
        }
        return null;
    }


    public void remove ( int key, String value ){
        if( counter != array.length){
            for( int i = 0; i < array.length ; i++ ){
                int index = hashFunction ( key, i);
                if(array[index] != null ){
                if( key == array [index].getKey()){
                    array[index]= null;
                } }else {
                    break;
                }
            }
        }
    }

    public void print (){
        if( counter != array.length){
            for( int i = 0; i < array.length ; i++ ){
                if(array[i] != null ){
                System.out.println( array [i].getKey());
                System.out.println(array[i].getValue());
                }
                
            }
        }
    }

}