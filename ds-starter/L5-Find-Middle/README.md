#  L5-Find-Middle

##  Problem Statement
Finding the middle of a Linked List
> Given a Linked List find the middle node as efficient as possible - using the least time(O(n) and space(O(1))

---

##  Assumptions
- Each node contains an integer value and a reference to the next node
- You may not modify the list structure.
- The list may be empty (`head = null`)
- The list may contain only one node (which makes it the default middle)
- If the list is of even length the first of the two middle nodes should be returned as the middle

---

##  Conceptual Solution
1. **Length Detection:**
   Use two pointers (`slow` and `fast`) that move at different speeds. Fast moves twice as fast as slow. Repeat while fast will not be null - detecting end of the list.
2. **Middle Detection**
   When fast reaches the end of the list, slow, which moves half as fast, will be at the middle. Return the middle value (slow) to the user.
---

##  Example
**Given List:** 1, 2, 3, 4, 5  

**slow and fast are set to first value (1)**
  
**1st iteration:**   
    slow = 2     
    fast = 3  

**2nd iteration:**  
    slow = 3  
    fast = 5;  

**3rd iteration**  
Fast would equal NULL so this iteration is not performed. 

The value stored in slow (**3**) is returned as the middle!