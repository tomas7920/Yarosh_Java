import java.io.*;

class Lists {
    public static class ArrayList<T> {
        private int size;
        private int i = 0;
        private Object[] arr;

        public ArrayList(int num) {
            size = num;
            arr = new Object[size];
        }

        public ArrayList() {
            this(10);
        }

        public int Size() {
            return i;
        }

        public void resize(int num) {
            Object[] arr2 = new Object[num];

            if(this.Size() < num) {
                num = this.Size();
            }

            i=0;

            for(int j = 0; j < num; j++) {
                arr2[j] = arr[j];
                i++;
            }

            arr = arr2;
        }

        public void add(T smt) {
            if(i == arr.length)
                resize(i+1);

            arr[i] = smt;
            i++;
        }

        public void remove(int index) {
            if(index > this.Size()-1) {
                System.out.print("Индекс больше чем размер листа");
                return;
            }

            arr[index] = null;
            for(int j = index; j < this.Size(); j++)
            {
                T t = (T) arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = t;
            }

        }

        public T get(int index) {
            return (T) arr[index];
        }

        public boolean contains(T smt) {
            for(int j = 0; j < this.Size(); j++) {
                if(arr[j] == smt)
                    return true;
            }

            return false;
        }

    }

    public static class Node<T> {
        T data;
        Node next;
    }

     public static class LinkedList<T> {
        private Node<T> head;
        private int size = 0;

        public void add(T d) {
            Node node = new Node<T>();
            node.data = d;

            if(head != null) {
                Node n = head;
                while(n.next != null) {
                    n = n.next;
                }
                n.next = node;
                size++;
            }
            else {
                head = node;
                size++;
            }
        }

        public void remove(int index) {
            if(size-1 < index){
                System.out.print("Индекс больше чем размер листа");
                return;
            }

            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.next;
            }

            Node n2 = n.next;
            n.next=n2.next;
            size--;
        }

        public boolean contains(T sd){
            Node n = head;
            while(n.next != null) {
                if(n.data == sd) {
                    return true;
                }
                n = n.next;
            }
            return false;
        }
     }

     public static class SerializationUtil<T> implements Serializable {
        private T inData;
        private T outData;

         public SerializationUtil(T data)
         {
             this.inData = data;
         }

         public T GetOutData() {
             return outData;
         }

         public void InFile(String file) throws IOException {
             ObjectOutputStream objectSteam = null;
             try {
                 objectSteam = new ObjectOutputStream(new FileOutputStream(file));;
                 objectSteam.writeObject(this.inData);
             } catch (IOException e) {
                 e.printStackTrace();
             }
             finally {
                 objectSteam.close();
             }
         }

         public void GetObjectFromFile(String file)
         {
             try {
                 ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file));
                 this.outData = (T) objectInput.readObject();

             } catch (IOException | ClassNotFoundException e) {
                 e.printStackTrace();
             }
         }
     }
}
