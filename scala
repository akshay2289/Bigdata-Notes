

what is pure function?
    1.
        a. sqrt(4) // its pure as this is not dependent on external parameter to impact the function
        b. dollortoRS(40) // impure

    2. doest change the input value
        a.def (a: Int) = {  a = a + 1 ; return a} // updating input hencew impure
        b. def (a: Int) = { return a + 1} // pure 
    3. should not have any sideeffect like print statement


Scala Type:

any consist of anyval and AnyRef
1. Anyval

   char Byte Short Int Long Float Double
   String
   Unit () Boolean 

2. AnyRef
   List , Seq , Tuple
   
 
Null - it can be assigned to any AnyRef type

Partially Applied function


-- Null is a trait for null and can be only used
-- Nil is an empty List
-- Nothing  is a trait in scala , there are no isntance of it when we throw an exception from method the return type will be Nothing and nothing is returned (throw new Exception)
-- Option it reutrn Some or None
- Unit is like a void in java

we should not use null in code , we should use option , we can handle using None , getOrElse


 