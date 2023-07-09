import java.util.Arrays;

public class ArrayList{
    private Object[] a;
    private int p;
    ArrayList(){
        a= new Object[3];
        p=0;
    }

    public void add(Object e){
        if(p>=a.length) increase();
        a[p]=e;
        p++;
    }

   	public void add(int index , Object data) {
		if(p>=a.length) increase();
		for(int i = size()-1; i>=index ; i--) {
			a[i+1] = a[i];
		}
		a[index] = data;
		p++;
	}

    private void increase(){
        Object[] temp=new Object[a.length+3];
        System.arraycopy(a, 0, temp, 0, a.length);
        a=temp;
    }

    public Object get(int index){
        if(index<=-1 || index>=a.length){
            throw new IndexOutOfBoundsException();
        }
        return a[index];
    }
    public void remove(int index){
        if(index<=-1 || index>=a.length){
            throw new IndexOutOfBoundsException();
        }
        for(int i=index;i<=size();i++){
            a[i]=a[i+1];
        }
        a[p]=null;
        p--;
    }

    public int size(){
        return p;
    }

    public void printItems(){
        System.out.println(Arrays.toString(a));
    }
}
