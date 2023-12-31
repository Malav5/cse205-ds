class Q290 {
    public boolean wordPattern(String pattern, String s) {
        
        String[] arr = s.split(" ");

        HashMap <Character, String> map =new HashMap<>();
          if(pattern.length() != arr.length) return false;


        for (int i=0; i<pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch))
            {
                if(!arr[i].equals(map.get(ch)))
                {
                    return false;
                }
            }

            else
            {
                //key is not present but value is present. (value present for some other key and that's not acceptable)
                if(map.containsValue(arr[i]))
                return false;

                else
                map.put(ch,arr[i]);
            }
        }

        return true;
    }
}