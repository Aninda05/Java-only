print("*****THE SUM OF SQUARES USING LAMBDA*****\n")
x=int(input("Enter the first number:"))
y=int(input("Enter the second number:"))
z=int(input("Enter the third number:"))
def fuc(x,y,z):
  a=lambda x:x*x
  b=lambda x,y:x+y*y
  c=lambda y,z:y+z*z
  return(c(b(a(x),y),z))
print"The result is: ",fuc(x,y,z)
