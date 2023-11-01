// we'll take user input of arr size and user input of deletion index

#include <iostream>

using namespace std;

int main()
{
  int arrSize;
  int deletionIndex;

  cout << "What size do you want the array to be?" << endl;

  cin >> arrSize;

  while (arrSize <= 0)
  {
    arrSize = 0;
    cout << "Err: wrong number, enter smth positive." << endl;
    cin >> arrSize;
  }

  int arr[arrSize];

  for (int i = 0; i < arrSize; i++)
  {
    arr[i] = i;
  }

  for (int i = 0; i < arrSize; i++)
  {
    cout << "Item At Index " << i << " : " << arr[i] << endl;
  }

  cout << "Which index do you want to remove" << endl;

  cin >> deletionIndex;

  if (deletionIndex < 0)
  {
    cout << "Err: wrong number, enter smth positive and smaller than " << arrSize << "." << endl;

    deletionIndex = 0;
  }
  else
  {
    for (int i = deletionIndex; i < arrSize - 1; i++)
    {
      arr[i] = arr[i + 1];
    }
  }

  cout << "Printing Arr Items" << endl;

  for (int i = 0; i < arrSize - 1; i++)
  {
    cout << "Item At Index " << i << " : " << arr[i] << endl;
  }

  return 0;
}