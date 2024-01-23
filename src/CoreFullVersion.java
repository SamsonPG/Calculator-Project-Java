	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
public class CoreFullVersion extends Calculator
{
	public CoreFullVersion(String strx)
	{
			            Double num,sum = 0.0;
			            String nstr=strx,op = null,spcl = null;
			            
			    		Pattern p = Pattern.compile("([0-9]+([.][0-9]*)?|[.][0-9]+)");// [+-]? add this for negative and postive num
			            List<String> numbers = new ArrayList<String>();
			            Matcher m = p.matcher(nstr);
			            while (m.find())
			            {
			            numbers.add(m.group());
			            }
			            //displaylabel.setText(numbers.toString());
			             
			           Pattern p2 = Pattern.compile("[\\\\/\\\\+\\\\*\\\\%\\\\-]");
			            //Pattern p2 = Pattern.compile("[+/%-*]");
			            List<String>operations = new ArrayList<String>();
			            Matcher m2 = p2.matcher(nstr);
			            while (m2.find())
			            {
			            operations.add(m2.group());
			            }
			            
			            if (numbers.size()/2==0&&numbers.size()==0)
			            	{
			            	List<String> addds = Arrays.asList("0");
			            	numbers.addAll(addds);
			            	}
			           
			            for (int i = 0; i <numbers.size()-1; i++)
			            {
			            	int flag=0;
			            	if(i==0)
			            		{
			            		 	num=Double.parseDouble(numbers.get(i));
			            		 	sum=num;
			            		 	
			            		}
			            	
			                Double num2=Double.parseDouble(numbers.get(i+1));
			                
			                String plus="+";
			                String minus="-";
			                String divide="/";
			                String multiplay="*";
			                String persentage="%";
			                op=operations.get(i);
			              
			                if(plus.equals(op)&&flag==0)
			                	{
			                    	sum=sum+num2;
			                    	flag=1;
			                    	//displaylabel.setText(sum.toString());
			                    	
			                	}
			                if(minus.equals(op)&&flag==0)
			                	{
			                    	sum=sum-num2;
			                    	flag=1;
			                    	//displaylabel.setText(sum.toString());
			                	}
			                if(divide.equals(op)&&flag==0)
			                	{
			                	if(num2!=0)
			                		{
			                			sum=sum/num2;
			                			flag=1;
			                			//displaylabel.setText(sum.toString());
			                		}
			                	else if(num2==0)
			                		{
			                			sum=0.0;
			                			flag=1;
			                			//displaylabel.setText(sum.toString());
			                		}
			                    }
			                if(multiplay.equals(op)&&flag==0)
		                		{
		                    		sum=sum*num2;
		                    		flag=1;
		                    		//displaylabel.setText(sum.toString());
		                		}
			                if(persentage.equals(op)&&flag==0)
	                		{
			                	
			                		sum=sum*100;
			                		flag=1;
			                		//displaylabel.setText(sum.toString());
			                	
	                		}
			               
			               
			            }
			            displaylabel.setText(sum.toString());
			            System.out.println(+sum);
	}
	}



