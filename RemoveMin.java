public class RemoveMin {
    public ListNode remove (ListNode list) {
        // replace statement below with code you write
        if(list.next == null)
            return null;
        int min = list.info;
        ListNode first = list;
        while(list != null){
            if(list.info < min){
                min = list.info;
            }
            list = list.next;
        }
        list = first;
        if(list.info == min){
            return list.next;
        }
        while(list.next.info != min){
            list = list.next;
        }
        list.next = list.next.next;
        list = first;
    return list;
    }
}