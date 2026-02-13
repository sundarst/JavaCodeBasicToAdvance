package accessModifer;

public class AccessModifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*1)How may Access Specifier ?
 * 1)private 
 * 2)protected
 * 3)public 
 * 
 *2)How many access control ?
 *	Four access control
 * 	1) private
 * 	2) protected
 *  3) public
 *  4) default
 * 
 *3)Access Modifier
 * A keyword in java that control who access class,method,variable(or)constructor 
 * 
 * it decided the visibility
 * 
 * 	1) private		(Access with in class)
 * 	2) protected    (access with in package and with in derived class)
 *  3) public		(access anywhere)
 *  4) default		(access with in package)
 *
 * 4)Non-Access Modifier
 * Non -Access Modifier do control access like private  protected public and default modifier they control 
 * how class method and variable can behave
 * 
 * static ----> Belong to interface or class
 * final -----> variable can't be change/overridden (constant)
 * abstract  ---> Implement by using subclass
 * synchronized ---> one thread can only access at time
 * volatile ---> Make variable always read from main memory.Not from catch
 * 
 * 
 * Access&Non-Access Modifier Applicable in java
 * 
 *| Modifier Type            | Modifier               | Class | Instance Variable | Method | Local Variable |
| ------------------------ | ---------------------- | ----- | ----------------- | ------ | -------------- |
| **Access Modifiers**     | `public`               | ✔️    | ✔️                | ✔️     | ❌              |

|                          | `private`              | ✔️    | ✔️                | ✔️     | ❌              |

|                          | `protected`            | ✔️    | ✔️                | ✔️     | ❌              |

|                          | *default* (no keyword) | ✔️    | ✔️                | ✔️     | ❌              |


| **Non-Access Modifiers** | `static`               | ❌     | ✔️                | ✔️     | ❌              |

|                          | `final`                | ✔️    | ✔️                | ✔️     | ✔️               |

|                          | `abstract`             | ✔️    | ❌                 | ✔️     | ❌               |

|                          | `synchronized`         | ❌     | ❌                 | ✔️     | ❌              |

|                          | `volatile`             | ❌     | ✔️                | ❌      | ❌              |

----------------------------------------------------------------------------------------------------------------

6.If class is decided as final you cannot extends(inherit) it

7.Why public private  protected default not allowed in local variable ?
	Because access Modifier control out side  visibility.But local variable never go out side 
	the method .So they are not allowed




 * 
 * 
 * 
 * 
 * */
 