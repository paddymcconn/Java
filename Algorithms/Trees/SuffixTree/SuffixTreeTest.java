package academy.learnprogramming.algorithm.suffixtree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SuffixTreeTest
{

    SuffixTree t;

    @Before
    public void init()
    {
        t = new SuffixTree("aabaaca".toCharArray());
    }

    @Test
    public void addUniqueTest()
    {
        Assert.assertEquals(Arrays.toString("bana$".toCharArray()), Arrays.toString(t.addUnique("bana".toCharArray())));
        Assert.assertEquals(Arrays.toString("banana$".toCharArray()), Arrays.toString(t.addUnique("banana".toCharArray())));
        Assert.assertEquals(Arrays.toString("a$".toCharArray()), Arrays.toString(t.addUnique("a".toCharArray())));
    }

    @Test
    public void buildSuffixTreeTest()
    {
        t.buildSuffixTree();
        t.dfsTraversal();
        System.out.println(t.root);
    }
}
