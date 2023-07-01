import java.util.PriorityQueue;

public class PPT191 {
    private int val;
	private PPT191 next;

	public PPT191 mergeKLists(PPT191[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        PriorityQueue<PPT191> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add the head nodes of all lists to the min heap
        for (PPT191 list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }
        
        PPT191 dummy = new PPT191();
        PPT191 curr = dummy;
        
        // Process the nodes from the min heap until it becomes empty
        while (!minHeap.isEmpty()) {
            PPT191 node = minHeap.poll();
            curr.next = node;
            curr = curr.next;
            
            // Move to the next node in the list
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }
        
        return dummy.next;
    }
}
