package trees.prefixtree;

public class PrefixTree
{
	PrefixNode root;
	public PrefixTree()
	{
		root = new PrefixNode();
	}
	/**
	 * assume we use 'cat' as the word.
	 * @param word
	 * @param id
	 */
	public void insert(char [] word, int id)
	{
		PrefixNode current = root;
		// root is the current object we have
		for(int i=0; i<word.length; i++)
		{
			if(current.hasChildren(word[i]))
				// check if the root has the letter c which it does not at the beginning.
			{
				current = current.getChildren(word[i]);
			}
			else // we are at a root or leaf node here.
			{
				PrefixNode node = new PrefixNode(word[i], 0);
				// assign the node
				current.addChildren(node);
				current = node;
			}
		}
		current.isWord = true;
		current.id = id;
	}
	
	

    public PrefixNode find(char[] word) {
        PrefixNode current = root;
        for(int i=0; i<word.length; i++) {
            if (current.hasChildren(word[i])) {
                current = current.getChildren(word[i]);
            } else {
                return null;
            }
        }
        return current;
    }


    public boolean delete(char[] word)
    {
        return delete(word, root, 0);
    }

    public boolean delete(char[] word, PrefixNode node, int wIndex)
    {
        if (wIndex == word.length-1)
        {
            PrefixNode w = node.getChildren(word[wIndex]);
            w.isWord = false;
            w.id = 0;
            
            if (w.canDelete())
            {
                node.children.remove(word[wIndex]);
                return true;
            }
        }
        else
        {
            if (!node.hasChildren(word[wIndex]))
            {
            	return false;
           	}
      
            boolean canDelete = delete(word, node.getChildren(word[wIndex]), ++wIndex);
            
            if (canDelete)
            {
               if (node.getChildren(word[--wIndex]).isWord)
               {
            	   return false;
               }
               node.children.remove(word[wIndex]);
               return true;
            }
        }
        return false;
    }
}