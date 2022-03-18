class ArrayStructures {
	private  int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	int a = 1;
	int b = 2;
	int c = 3;
	public void genereateRandomArray(){
		for(int i = 0; i < arraySize; i++ ){
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	
	public void printArray(){
		for(int i = 0;  i < arraySize; i++){
			System.out.print("| " + i +" | ");
			System.out.println(theArray[i] + " |");
		}

	}
	
	public int getValueAtIndex(int index){
		if(index < arraySize){
			return theArray[index];
		}
		return 0;
	}
	
	public boolean doesArrayContainThisValue(int searchValue){
		boolean valueInArray = false;
		
		for(int i = 0; i < arraySize; i++){
			if (theArray[i] == searchValue){
				valueInArray = true;
			}
		}		
		return valueInArray;
	}
	
	public void deleteIndex(int index){
		if(index < arraySize){
			for(int i = index; i < (arraySize - 1); i ++){
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
	}
	
	public void insertValue(int value){
		if(arraySize < 50){
			theArray[arraySize] = value;
			arraySize++;
		}
		
	}
	
	public String linearSearchForValue(int value){
		boolean valueInArray = false;
		String indexWithValue = "";
		
		System.out.println("The Value was Found in Following: ");
		
		for(int i = 0; i < arraySize; i++){
			if(theArray[i] == value){
			
				valueInArray = true;
				System.out.print(i + " ");
				indexWithValue = indexWithValue + i + " ";
			}
		}

		if(!valueInArray){
			indexWithValue = "none";
			System.out.println(indexWithValue);
		}
		System.out.println();
		return indexWithValue;
		
	}
	
	public void bubbleSort(){
		for(int i = arraySize - 1; i > 1; i--){
			for(int j = 0; j < i; j++){
				if(theArray[j] > theArray[j+1]){
					swapValues(j, j+1);
				}
			}
		}
	}
	
	public void swapValues(int indexOne, int indexTwo){
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		
	}
	
	public void binarySearchForValue(int value ){
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex){
			int middleIndex =(lowIndex + highIndex) / 2;
			if(theArray[middleIndex] < value){
				lowIndex = middleIndex + 1;
			}
			else if(theArray[middleIndex] > value){
				highIndex = middleIndex - 1;	
			}
			else{
				System.out.println("\n Found a Match for " + value + " at Index " + middleIndex);
				lowIndex = highIndex + 1;
			}
			
		}
		
	}
	
	public static void main (String[] args) {
		ArrayStructures newArray = new ArrayStructures();
		newArray.genereateRandomArray();
		newArray.printArray();
		/*
		System.out.println(newArray.getValueAtIndex(11));
		System.out.println(newArray.doesArrayContainThisValue(11));
		newArray.deleteIndex(2);	
		newArray.printArray();
		System.out.println();
		newArray.insertValue(12123);
		newArray.printArray();
		newArray.linearSearchForValue(12);
		newArray.bubbleSort();
		System.out.println();
		newArray.printArray();
		*/
		
		
		newArray.bubbleSort();
		newArray.binarySearchForValue(12);
		newArray.binarySearchForValue(14);
		newArray.binarySearchForValue(16);
		
	}
    	
    
}