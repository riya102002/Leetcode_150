class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                
                continue;
            } else if (part.equals("..")) {
                
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                
                stack.push(part);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        String canonicalPath = "";
        for (String dir : stack) {
            canonicalPath += "/" + dir;
        }

        return canonicalPath;
    }
}
