class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       if(numCourses<=0)
           return false;
        int[] indegree = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++)
            indegree[prerequisites[i][1]]++;
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i=0;i<numCourses;i++)
            if(indegree[i]==0)
                queue.add(i);
        
        ArrayList<Integer> vector = new ArrayList<Integer>();
        int count = 0;
        while(!queue.isEmpty())
        {
            int n = queue.poll();
            vector.add(n);
            for(int i=0;i<prerequisites.length;i++)
            {
                if(prerequisites[i][0] == n && --indegree[prerequisites[i][1]]==0)
                    queue.add(prerequisites[i][1]);
            }
            count++;                   
        }
        Iterator itr = vector.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        return count==numCourses;
    }
    
   
}