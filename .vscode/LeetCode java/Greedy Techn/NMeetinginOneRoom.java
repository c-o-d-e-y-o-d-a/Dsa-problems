class Meeting {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MeetingCompare implements Comparator<Meeting> {
    @Override
    public int compare(Meeting o1, Meeting o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        return 0;
    }
}

class Solution {
    public static int maxMeetings(int start[], int end[], int n) {
        int ans = 0;
        ArrayList<Meeting> meetingList = new ArrayList<Meeting>();
        
        // Populate the meetingList
        for (int i = 0; i < n; i++) {
            Meeting a = new Meeting(start[i], end[i]);
            meetingList.add(a);
        }

        MeetingCompare mc = new MeetingCompare();
        Collections.sort(meetingList, mc);

        int limit = meetingList.get(0).end;

        for (int i = 1; i < meetingList.size(); i++) {
            if (meetingList.get(i).start > limit) {
                limit = meetingList.get(i).end;
                ans++;
            }
        }
        
        return ++ans;
    }}