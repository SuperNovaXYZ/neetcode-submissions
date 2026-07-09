class Twitter {

    Map<Integer,Set<Integer>> followMap;
    Map<Integer,List<int[]>> tweetMap;
    int count;

    public Twitter() {
       this.followMap= new HashMap<>();
       this.tweetMap= new HashMap<>();
       this.count=0;
        
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.putIfAbsent(userId, new ArrayList<>());
        
        int[] tweet= {count,tweetId};

        tweetMap.get(userId).add(tweet);
        count++;
        
    }
    
     public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();

        // Each heap item:
        // [time, tweetId, userId, indexInThatUsersTweetList]
        PriorityQueue<int[]> maxHeap =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(b[0], a[0])
            );

        // Include the user themself
        Set<Integer> users = new HashSet<>();
        users.add(userId);

        // Include everyone the user follows
        if (followMap.containsKey(userId)) {
            users.addAll(followMap.get(userId));
        }

        // Put each user's newest tweet into the heap
        for (int currentUser : users) {

            if (!tweetMap.containsKey(currentUser)) {
                continue;
            }

            List<int[]> tweets = tweetMap.get(currentUser);

            int lastIndex = tweets.size() - 1;
            int[] newestTweet = tweets.get(lastIndex);

            int time = newestTweet[0];
            int tweetId = newestTweet[1];

            maxHeap.offer(
                new int[]{time, tweetId, currentUser, lastIndex}
            );
        }

        // Retrieve at most 10 newest tweets
        while (!maxHeap.isEmpty() && result.size() < 10) {

            int[] currentTweet = maxHeap.poll();

            int tweetId = currentTweet[1];
            int currentUser = currentTweet[2];
            int currentIndex = currentTweet[3];

            result.add(tweetId);

            // Move to the previous tweet from this same user
            int previousIndex = currentIndex - 1;

            if (previousIndex >= 0) {
                int[] previousTweet =
                    tweetMap.get(currentUser).get(previousIndex);

                int previousTime = previousTweet[0];
                int previousTweetId = previousTweet[1];

                maxHeap.offer(
                    new int[]{
                        previousTime,
                        previousTweetId,
                        currentUser,
                        previousIndex
                    }
                );
            }
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId, new HashSet<>());

        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}
