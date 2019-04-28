// Assignment 22
// CarRepair.java
// CECS 274
// Kevin Phan
// 015260958

public class CarRepair
{

  public CarRepair()
  {
      HighCarQueue = new Queue<Car>();
      MidCarQueue = new Queue<Car>();
      LowCarQueue = new Queue<Car>();
  };

  public static class Car
  {
    int CarID;
    float Cost;
  };

  // Accepts a car and places it in a repair queue.
  public void AcceptHighPriorityCar(Car newcar)
  {
    // YOU fill in
      HighCarQueue.Store(newcar);
  };
  public void AcceptMediumPriorityCar(Car newcar)
  {
    // YOU fill in
      MidCarQueue.Store(newcar);
  };
  public void AcceptLowPriorityCar(Car newcar)
  {
    // YOU fill in
      LowCarQueue.Store(newcar);
  };

  // Returns true if all three queues are empty.
  // (HighPriority AND MedimumPriority AND LowPriority)
  public boolean NoCars()
  {
    // Fake code, YOU remove and replace with real thing
    return HighCarQueue.Empty() &&
	         MidCarQueue.Empty() &&
	         LowCarQueue.Empty();
  };

  // Repairs (returns) a car.
  // If there are cars in the HighPriority Queue
  //   It returns the first car in that queue (and removes
  //   it from the queue.
  // If there are no cars in the HighPriority Queue
  // and if there are cars in the MediumPriority Queue
  //   It returns the first car in that queue (and removes
  //   it from the queue.
  // If there are no cars in the HighPriority Queue
  // and if there are no cars in the MediumPriority Queue
  // and if there are cars in the LowPriority Queue
  //   It returns the first car in that queue (and removes
  //   it from the queue.
  // if there are no cars in any queue it throws Exception

  public Car RepairCar() throws Exception
  {
      Car Repaired = new Car();
      if(NoCars())
	     throw new Exception();
      else if(HighCarQueue.Empty() != true)
	     {
	      Repaired = HighCarQueue.Retrieve();
	      HighCarQueue.Delete();
	     }
      else if(MidCarQueue.Empty() != true)
	     {
	      Repaired = MidCarQueue.Retrieve();
	      MidCarQueue.Delete();
	     }
      else if(LowCarQueue.Empty() != true)
	    {
	      Repaired = LowCarQueue.Retrieve();
	      LowCarQueue.Delete();
	    }
     return Repaired;
  };
private Queue<Car> HighCarQueue;
private Queue<Car> MidCarQueue;
private Queue<Car> LowCarQueue;


  // YOU fill in
  // Three queues of cars (variables) should be declared here,
  // high  priority, medimum priority, low priorty.
  // These should be private.
  // You may initialize the variables here (i.e., create the
  // queues or you may add a constructor to the class to
  // initialize them.
};
