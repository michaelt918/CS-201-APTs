public class AddAt {
    public ListNode addAt(ListNode list, ListNode toAdd, int index) {   
        ListNode first = list;
        if(toAdd == null)
                return list;
        if(list == null)
            return toAdd;
        if(index == 0){
            list = toAdd;
            while (list.next != null){
                list = list.next;
            }
            list.next = first;
            return toAdd;
        }   
        for(int i = 0; i + 1 < index; i++){
            list = list.next;
        }
        ListNode remaining = list.next;
        list.next = toAdd;
        while (list.next != null){
            list = list.next;
        }
        list.next = remaining;
        return first;
    }
  }