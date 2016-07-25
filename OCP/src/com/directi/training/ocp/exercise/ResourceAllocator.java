package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType)
    {
        int resourceId;
        switch (resourceType) {
        case TIME_SLOT:
            resourceId = findFreeTimeSlot();
            markTimeSlotBusy(resourceId);
            break;
        case SPACE_SLOT:
            resourceId = findFreeSpaceSlot();
            markSpaceSlotBusy(resourceId);
            break;
        default:
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
            break;
        }
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        switch (resourceType) {
        case TIME_SLOT:
            markTimeSlotFree(resourceId);
            break;
        case SPACE_SLOT:
            markSpaceSlotFree(resourceId);
            break;
        default:
            System.out.println("ERROR: attempted to free invalid resource");
            break;
        }
    }

    private void markSpaceSlotFree(int resourceId)
    {
    }

    private void markTimeSlotFree(int resourceId)
    {
    }

    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }

    private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }
}
